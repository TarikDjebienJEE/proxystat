package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.factory.IServiceFactory;

/**
 * Service factory simple implementation
 * @author acraske
 *
 */
@Component(value = "serviceFactory")
public class ServiceFactoryImpl implements IServiceFactory {

	@Override
	public Service createService(String name, String description) {
		Service service = new Service();
		service.setName(name);
		service.setDescription(description);
		
		return service;
	}


}
