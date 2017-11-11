package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IServiceDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Service;

/**
 * CRUD Implementation Service
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class ServiceDAOImpl extends GenericJpaDataAccessObject<Service, Long> implements IServiceDAO {}
