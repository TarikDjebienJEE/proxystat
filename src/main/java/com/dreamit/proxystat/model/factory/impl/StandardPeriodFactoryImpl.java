package com.dreamit.proxystat.model.factory.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.StandardPeriod;
import com.dreamit.proxystat.model.factory.IPeriodFactory;

@Component(value = "StandardPeriodFactory")
public class StandardPeriodFactoryImpl implements IPeriodFactory {

	@Override
	public Period createPeriod(String name, Date startDate, Date endDate) {
		Period standardPeriod = new StandardPeriod();
		standardPeriod.setName(name);
		standardPeriod.setStartDate(startDate);
		standardPeriod.setEndDate(endDate);
		return standardPeriod;
	}

}
