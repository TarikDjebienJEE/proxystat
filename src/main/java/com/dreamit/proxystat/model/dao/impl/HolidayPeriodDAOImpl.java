package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IHolidayPeriodDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.HolidayPeriod;

/**
 * CRUD Implementation HolidayPeriod
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class HolidayPeriodDAOImpl extends GenericJpaDataAccessObject<HolidayPeriod, Long> implements IHolidayPeriodDAO {}
