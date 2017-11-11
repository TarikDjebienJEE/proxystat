package com.dreamit.proxystat.model.factory.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.Season;
import com.dreamit.proxystat.model.factory.ISeasonFactory;

@Component
public class SeasonFactoryImpl implements ISeasonFactory {

	@Override
	public Season createSeason(String name, Date startDate, Date endDate) {
		Season season = new Season();
		season.setName(name);
		season.setStartDate(startDate);
		season.setEndDate(endDate);
		
		return season;
	}

}
