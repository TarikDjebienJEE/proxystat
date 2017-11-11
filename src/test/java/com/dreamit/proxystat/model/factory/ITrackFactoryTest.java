package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;


import com.dreamit.proxystat.model.entities.Track;
import com.dreamit.proxystat.model.factory.impl.TrackFactoryImpl;


/**
 * 
 * @author rudy stienne
 *
 */

@RunWith(MockitoJUnitRunner.class)
public class ITrackFactoryTest {

	
	@InjectMocks
	private TrackFactoryImpl factory;
	
	@Test
	public void testCanCreateTrackUsingFactory() {
		Track result;
		Track expected = new Track();
		String name="a";
		String domain="a";
		String type="a";
		expected.setName(name);
		expected.setDomain(domain);
		expected.setType(type);
		
		
		result = factory.createTrack(name, domain,type);
		
		assertEquals(expected.getName(), result.getName());
		assertEquals(expected.getDomain(), result.getDomain());
		assertEquals(expected.getType(), result.getType());
		
		
	}
}
