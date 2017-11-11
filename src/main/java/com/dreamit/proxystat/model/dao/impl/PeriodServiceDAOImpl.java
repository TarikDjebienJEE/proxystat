package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IPeriodServiceDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.PeriodService;

/**
 * CRUD Implementation PeriodService
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class PeriodServiceDAOImpl extends GenericJpaDataAccessObject<PeriodService, Long> implements IPeriodServiceDAO {}
