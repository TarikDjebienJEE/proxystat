package com.dreamit.proxystat.model.factory;

import java.util.Date;

import com.dreamit.proxystat.model.entities.Period;


/**
 * Period factory for controllers
 * @author tarik
 *
 */
public interface IPeriodFactory {

	/**
	 * factory method, don't persist the object
	 * @param name
	 * @param description
	 * @return a new instance of a period
	 */
	Period createPeriod(String name, Date startDate, Date endDate);
	
}
