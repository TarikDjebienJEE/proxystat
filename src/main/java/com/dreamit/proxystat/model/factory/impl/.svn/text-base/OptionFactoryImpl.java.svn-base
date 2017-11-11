package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.Option;
import com.dreamit.proxystat.model.factory.IOptionFactory;

@Component
public class OptionFactoryImpl implements IOptionFactory {

	@Override
	public Option createOption(Boolean perPerson, Float pricePercentage) {
		Option option = new Option();
		option.setPerPerson(perPerson);
		option.setPricePercentage(pricePercentage);
		return option;
	}

}
