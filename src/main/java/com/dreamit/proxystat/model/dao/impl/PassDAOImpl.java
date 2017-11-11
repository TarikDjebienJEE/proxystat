package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IPassDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Pass;

/**
 * CRUD Implementation Pass
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class PassDAOImpl extends GenericJpaDataAccessObject<Pass, Long> implements IPassDAO {}
