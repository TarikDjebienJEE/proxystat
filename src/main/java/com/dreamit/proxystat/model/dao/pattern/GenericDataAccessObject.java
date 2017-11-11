package com.dreamit.proxystat.model.dao.pattern;

import java.io.Serializable;

import java.util.List;
import java.util.Map;

/**
 * Generic Data Access Object, providing basic CRUD operations
 *
 * @author tarik DJEBIEN
 *
 * @param <E> the entity type
 * @param <PK> the primary key type
 */
public interface GenericDataAccessObject<E, PK extends Serializable> {

    /**
     * Get the Class of the entity
     *
     * @return the class
     */
    Class<E> getEntityClass();

    /**
     * Find an entity by its unique id as primary key
     *
     * @param id the primary key
     * @return the entity
     */
    E findById(final PK id);

    /**
     * Load all entities
     *
     * @return the list of entities
     */
    List<E> findAll();
    
    /**
     * Load all entities order by property Name
     *
     * @return the list of entities order by property Name asc
     */
    List<E> findAllOrderByPropertyName(final String propertyName);

    /**
     * Find entities based on an sample
     *
     * @param sampleInstance the sample entity instance
     * @return the list of entities
     */
    List<E> findByExample(final E sampleInstance);

    /**
     * Find using a named query
     *
     * @param queryName the name of the query
     * @param params the query parameters
     *
     * @return the list of entities
     */
    List<E> findByNamedQuery(final String queryName, Object... params);

    /**
     * Find using a named query
     *
     * @param queryName the name of the query
     * @param params the query parameters
     *
     * @return the list of entities
     */
    List<E> findByNamedQueryAndNamedParams(final String queryName, final Map<String, ?extends Object> params);

    /**
     * Count all entities
     *
     * @return the number of entities
     */
    int countAll();

    /**
     * Count entities based on an example
     *
     * @param sampleInstance the search criteria
     * @return the number of entities
     */
    int countByExample(final E sampleInstance);
    
    /**
     * save an entity. This can be either a INSERT or UPDATE in the database
     * 
     * @param entity the entity to save
     * 
     * @return the saved entity
     */
    E save(final E entity);

    /**
     * delete an entity from the database
     * 
     * @param entity the entity to delete
     */
    void delete(final E entity);
}
