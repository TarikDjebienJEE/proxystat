package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.SportPartner;
import com.dreamit.proxystat.model.entities.TrainingPartner;
import com.dreamit.proxystat.model.factory.impl.MechanicPartnerFactoryImpl;
import com.dreamit.proxystat.model.factory.impl.SportPartnerFactoryImpl;
import com.dreamit.proxystat.model.factory.impl.TrainingPartnerFactoryImpl;

/**
 * Partner factory test
 * @author tarik DJEBIEN
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IPartnerFactoryTest {

	@InjectMocks
	private MechanicPartnerFactoryImpl factoryMechanicPartner;
	
	@InjectMocks
	private SportPartnerFactoryImpl factorySportPartner;
	
	@InjectMocks
	private TrainingPartnerFactoryImpl factoryTrainingPartner;
	
	@Test
	public void testCanCreatePartnerMechanicUsingFactory() {
		MechanicPartner result;
		MechanicPartner expected = new MechanicPartner();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description );
		
		result = (MechanicPartner) factoryMechanicPartner.createPartner(name, description);
		
		assertEquals(expected.getName(), 		result.getName());
		assertEquals(expected.getDescription(), 	result.getDescription());
	}
	
	@Test
	public void testCanCreatePartnerSportUsingFactory() {
		SportPartner result;
		SportPartner expected = new SportPartner();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description );
		
		result = (SportPartner) factorySportPartner.createPartner(name, description);
		
		assertEquals(expected.getName(), 		result.getName());
		assertEquals(expected.getDescription(), 	result.getDescription());
	}
	
	@Test
	public void testCanCreatePartnerTrainingUsingFactory() {
		TrainingPartner result;
		TrainingPartner expected = new TrainingPartner();
		String name = "name";
		expected.setName(name);
		String description = "description";
		expected.setDescription(description );
		
		result = (TrainingPartner) factoryTrainingPartner.createPartner(name, description);
		
		assertEquals(expected.getName(), 		result.getName());
		assertEquals(expected.getDescription(), 	result.getDescription());
	}
	
}
