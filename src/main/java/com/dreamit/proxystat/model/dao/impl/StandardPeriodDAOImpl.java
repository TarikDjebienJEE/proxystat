package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IStandardPeriodDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.StandardPeriod;

/**
 * CRUD Implementation StandardPeriod
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class StandardPeriodDAOImpl extends GenericJpaDataAccessObject<StandardPeriod, Long> implements IStandardPeriodDAO {}
