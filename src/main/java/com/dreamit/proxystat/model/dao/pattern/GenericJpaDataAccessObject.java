package com.dreamit.proxystat.model.dao.pattern;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Required;

/**
 * JPA implementation of the GenericRepository. Note that this implementation
 * also expects Hibernate as JPA implementation. That's because we use the
 * Criteria API.
 * 
 * @author tarik DJEBIEN
 * 
 * @param <E> The persistent type
 * @param <T> The primary key type
 */
@SuppressWarnings("unchecked")
public class GenericJpaDataAccessObject<E, T extends Serializable> implements GenericDataAccessObject<E, T> {

	private final Logger logger;
	
	private final Class<E> persistentClass;
	
	private EntityManager entityManager;
	
	public GenericJpaDataAccessObject() {
		this.persistentClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		this.logger = Logger.getLogger(getEntityClass().getName());
	}

	public GenericJpaDataAccessObject(final Class<E> persistentClass) {
		super();
		this.persistentClass = persistentClass;
		this.logger = Logger.getLogger(getEntityClass().getName());
	}

	@Override
	public int countAll() {
		return countByCriteria();
	}

	@Override
	public int countByExample(final E sampleInstance) {
		Criteria crit = getHibernateSession().createCriteria(getEntityClass());
		crit.setProjection(Projections.rowCount());
		crit.add(Example.create(sampleInstance));
		return (Integer) crit.list().get(0);
	}

	@Override
	public List<E> findAll() {
		return findByCriteria();
	}

	@Override
	public List<E> findByExample(final E exampleInstance) {
		Criteria crit = getHibernateSession().createCriteria(getEntityClass()).add( Example.create(exampleInstance) );
		final List<E> result = crit.list();  
		return result; 
	}

	@Override
	public E findById(final T id) {
		final E result = getEntityManager().find(persistentClass, id);
		return result;
	}

	@Override
	public List<E> findByNamedQuery(final String name, Object... params) {
		javax.persistence.Query query = getEntityManager().createNamedQuery(name);

		for (int i = 0; i < params.length; i++) {
			query.setParameter(i + 1, params[i]);
		}

		final List<E> result = (List<E>) query.getResultList();
		return result;
	}

	@Override
	public List<E> findByNamedQueryAndNamedParams(final String name, final Map<String, ? extends Object> params) {
		javax.persistence.Query query = getEntityManager().createNamedQuery(name);

		for (final Map.Entry<String, ? extends Object> param : params.entrySet()) {
			query.setParameter(param.getKey(), param.getValue());
		}

		final List<E> result = (List<E>) query.getResultList();
		return result;
	}

	@Override
	public Class<E> getEntityClass() {
		return persistentClass;
	}

	/**
	 * set the JPA entity manager to use.
	 *
	 * @param entityManager
	 */
	@Required
	@PersistenceContext
	private void setEntityManager(final EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	private EntityManager getEntityManager() {
		return entityManager;
	}
	
	protected Session getHibernateSession(){
		return (Session) entityManager.getDelegate();
	}

	/**
	 * @return the logger
	 */
	protected Logger getLogger() {
		return logger;
	}

	/**
	 * Use this inside subclasses as a convenience method.
	 */
	protected List<E> findByCriteria(final Criterion... criterion) {
		return findByCriteria(-1, -1, criterion);
	}

	/**
	 * Use this inside subclasses as a convenience method.
	 */
	protected List<E> findByCriteria(final int firstResult, final int maxResults, final Criterion... criterion) {
		Criteria crit = getHibernateSession().createCriteria(getEntityClass());

		for (final Criterion c : criterion) {
			crit.add(c);
		}

		if (firstResult > 0) {
			crit.setFirstResult(firstResult);
		}

		if (maxResults > 0) {
			crit.setMaxResults(maxResults);
		}

		final List<E> result = crit.list();
		return result;
	}

	protected int countByCriteria(Criterion... criterion) {
		Long res;
		Criteria crit = getHibernateSession().createCriteria(getEntityClass());
		crit.setProjection(Projections.rowCount());

		for (final Criterion c : criterion) {
			crit.add(c);
		}

		res = (Long) crit.list().get(0);
		return Math.round(res);
	}

	@Override
	public void delete(E entity) {
		E attached = getEntityManager().merge(entity);
		getEntityManager().remove(attached);
	}

	@Override
	public E save(E entity) {
		final E savedEntity = getEntityManager().merge(entity);
		return savedEntity;
	}

	@Override
	public List<E> findAllOrderByPropertyName(final String propertyName) {
		Criteria crit = getHibernateSession().createCriteria(getEntityClass());
		crit.addOrder(Order.asc(propertyName));
		return crit.list();
	}

}
