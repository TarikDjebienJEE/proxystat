package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Duration;
import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.Track;
import com.dreamit.proxystat.model.factory.impl.PassFactoryImpl;




/**
 * 
 * @author rudy stienne
 *
 */

@RunWith(MockitoJUnitRunner.class)
public class IPassFactoryTest {
	
	@InjectMocks
	private PassFactoryImpl factory;
	
	@Test
	public void testCanCreatePassUsingFactory() {
		Pass result;
		Pass expected = new Pass();
		Service service=null;
		Track track = null;
		Duration duration=null;
		AgeCategory ageCategory=null;
		Price price=null;
		Period period=null;
		MechanicPartner mechanicPartner=null;
		Boolean cautionReturned=null;
		Float cautionPrice=null;
		expected.setService(service);
		expected.setTrack(track);
		expected.setDuration(duration);
		expected.setAgeCategory(ageCategory);
		expected.setPrice(price);
		expected.setPeriod(period);
		expected.setMechanicPartner(mechanicPartner);
		expected.setCautionReturned(cautionReturned);
		expected.setCautionPrice(cautionPrice);
		
		result = factory.createPass(service, track,duration, ageCategory, price,period,mechanicPartner,cautionReturned,cautionPrice);
		
		assertEquals(expected.getService(), result.getService());
		assertEquals(expected.getTrack(), result.getTrack());
		assertEquals(expected.getDuration(), result.getDuration());
		assertEquals(expected.getAgeCategory(), result.getAgeCategory());
		assertEquals(expected.getPrice(), result.getPrice());
		assertEquals(expected.getPeriod(), result.getPeriod());
		assertEquals(expected.getMechanicPartner(), result.getMechanicPartner());
		assertEquals(expected.getCautionReturned(), result.getCautionReturned());
		assertEquals(expected.getCautionPrice(), result.getCautionPrice());
	}
}
