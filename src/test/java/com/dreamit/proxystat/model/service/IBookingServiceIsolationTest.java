package com.dreamit.proxystat.model.service;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dao.IAgeCategoryDAO;
import com.dreamit.proxystat.model.dao.IBookingDAO;
import com.dreamit.proxystat.model.dao.IEquipmentDAO;
import com.dreamit.proxystat.model.dao.IFlatDAO;
import com.dreamit.proxystat.model.dao.IGuestDAO;
import com.dreamit.proxystat.model.dao.IOptionDAO;
import com.dreamit.proxystat.model.dao.IPassDAO;
import com.dreamit.proxystat.model.dao.IPaymentCreditDAO;
import com.dreamit.proxystat.model.dao.IPeriodServiceDAO;
import com.dreamit.proxystat.model.dao.IServiceDAO;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.service.impl.BookingServiceImpl;

/**
 * admin common test class
 * @author acraske
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IBookingServiceIsolationTest {
	
	@InjectMocks 
	private BookingServiceImpl service;
	
	@Mock
	private IFlatDAO flatDao;

	@Mock
	private IServiceDAO serviceDao;

	@Mock
	private IOptionDAO optionDao;

	@Mock
	private IAgeCategoryDAO ageCategoryDao;

	@Mock
	private IEquipmentDAO equipementDao;

	@Mock
	private IPassDAO passDao;

	@Mock
	private IGuestDAO guestDao;

	@Mock
	private IPeriodServiceDAO periodServiceDao;

	@Mock
	private IPaymentCreditDAO paymentCreditDao;

	@Mock
	private IAgeCategoryDAO ageCategoryDAO;

	@Mock
	private IBookingDAO bookingDao;
	
	@Test(expected=IllegalArgumentException.class)
	public void testThrowExceptionWhenTryToCancelNullBooking() {
		Booking booking = null;
		
		service.cancelBooking(booking);
		
	}
	
	@Test
	public void testCallPersistanceLayerToSaveBookingAfterCancel() {
		Booking booking = new Booking();
		
		service.cancelBooking(booking);
		
		verify(bookingDao).save(booking);
	}
	
	@Test
	public void testCallPersistanceLayerToFindBooking() {
		Long id = new Long(1);
		
		service.findBookingById(id);
		
		verify(bookingDao).findById(id);
	}
	
}