package com.dreamit.proxystat.model.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.entities.Flat;
import com.dreamit.proxystat.model.factory.impl.FlatFactoryImpl;

/**
 * Flat factory test
 * @author tarik DJEBIEN
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IFlatFactoryTest {

	@InjectMocks
	private FlatFactoryImpl factory;
	
	@Test
	public void testCanCreateFlatUsingFactory() {
		Flat result;
		Flat expected = new Flat();
		String roomNumber = "23";
		String floor = "2";
		Boolean handicapAccess = true;
		String status = "status";
		Boolean avalaible = true;
		expected.setRoomNumber(roomNumber);
		expected.setFloor(floor);
		expected.setHandicapAccess(handicapAccess );
		expected.setStatus(status);
		expected.setAvalaible(avalaible );
		
		result = factory.createFlat(roomNumber, floor, handicapAccess, status, avalaible);
		
		assertEquals(expected.getRoomNumber(), 		result.getRoomNumber());
		assertEquals(expected.getFloor(), 	result.getFloor());
		assertEquals(expected.getHandicapAccess(), 	result.getHandicapAccess());
		assertEquals(expected.getStatus(), 	result.getStatus());
		assertEquals(expected.getAvalaible(), 	result.getAvalaible());
	}
	
}
