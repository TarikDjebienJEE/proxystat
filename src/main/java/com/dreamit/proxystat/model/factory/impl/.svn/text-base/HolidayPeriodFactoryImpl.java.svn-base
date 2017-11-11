package com.dreamit.proxystat.model.factory.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.HolidayPeriod;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.factory.IPeriodFactory;

@Component(value = "HolidayPeriodFactory")
public class HolidayPeriodFactoryImpl implements IPeriodFactory {

	@Override
	public Period createPeriod(String name, Date startDate, Date endDate) {
		Period holidayPeriod = new HolidayPeriod();
		holidayPeriod.setName(name);
		holidayPeriod.setStartDate(startDate);
		holidayPeriod.setEndDate(endDate);
		return holidayPeriod;
	}

}
