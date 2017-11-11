package com.dreamit.proxystat.model.service;


import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.dreamit.proxystat.model.dao.IMechanicPartnerDAO;
import com.dreamit.proxystat.model.dao.IPassDAO;
import com.dreamit.proxystat.model.dao.ITrackDAO;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Track;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.service.impl.AdministrationPassMechanicPartnerServiceImpl;


/**
 * 
 * @author rudy stienne
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class IAdministrationPassMechanicPartnerServiceTest {

	@InjectMocks 
	private AdministrationPassMechanicPartnerServiceImpl administrationPassMechanicPartnerService;
	
	@Mock
	private IPassDAO passDao;
	
	@Mock
	private ITrackDAO trackDao;
	
	@Mock
	private IMechanicPartnerDAO mechanicPartnerDao;
	
	@Before
	public void setUp() throws Exception{
	
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreatePassWithoutName() throws MissingRequiredInformationException {
		Pass pass = new Pass();
		Track track = new Track();
		track.setId(new Long(1));
		track.setDomain("ToutSchuss");
		track.setType("alpin");
		pass.setTrack(track);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		pass.setAgeCategory(ageCategory);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		pass.setPrice(price);
		
		administrationPassMechanicPartnerService.savePass(pass);
		
	}	
	
	@Test(expected=MissingRequiredInformationException.class)
	public void  testCannotCreatePassWithoutDomain() throws MissingRequiredInformationException{
		Pass pass = new Pass();
		Track track = new Track();
		track.setId(new Long(1));
        track.setName("ToutSchuss standard");
        track.setType("alpin");
		pass.setTrack(track);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		pass.setAgeCategory(ageCategory);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		pass.setPrice(price);
		
		administrationPassMechanicPartnerService.savePass(pass);
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreatePassWithoutType() throws MissingRequiredInformationException{
		Pass pass = new Pass();
		Track track = new Track();
		track.setId(new Long(1));
        track.setName("ToutSchuss standard");
        track.setDomain("ToutSchuss");
		pass.setTrack(track);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		pass.setAgeCategory(ageCategory);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		pass.setPrice(price);
		
		administrationPassMechanicPartnerService.savePass(pass);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotCreatePassWithoutPrice() throws MissingRequiredInformationException{
		Pass pass = new Pass();
		Track track = new Track();
		track.setId(new Long(1));
        track.setName("ToutSchuss standard");
        track.setDomain("ToutSchuss");
        track.setType("alpin");
		pass.setTrack(track);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		pass.setAgeCategory(ageCategory);
		
		
		Pass passReturn = administrationPassMechanicPartnerService.savePass(pass);
		
		assertNull(passReturn);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotCreatePassWithoutAgeCategory() throws MissingRequiredInformationException{
		Pass pass = new Pass();
		Track track = new Track();
		track.setId(new Long(1));
        track.setName("ToutSchuss standard");
        track.setDomain("ToutSchuss");
        track.setType("alpin");
		pass.setTrack(track);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		pass.setPrice(price);
		
		
		administrationPassMechanicPartnerService.savePass(pass);

	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCannotSavePassWithNullPass() throws MissingRequiredInformationException {
		
		administrationPassMechanicPartnerService.savePass(null);

	}
	
	@Test
	public void testCanSaveOrUpdate() throws MissingRequiredInformationException{
		Pass pass = new Pass();
		pass.setId(new Long(11));
		Track track = new Track();
		track.setId(new Long(1));
        track.setName("ToutSchuss standard");
        track.setDomain("ToutSchuss");
        track.setType("alpin");
		pass.setTrack(track);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		pass.setAgeCategory(ageCategory);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		pass.setPrice(price);
		
		administrationPassMechanicPartnerService.savePass(pass);
		
		verify(passDao).save(pass);
	}
	@Test
	public void testCanListPass(){
		MechanicPartner mechanicPartner = new MechanicPartner();
		mechanicPartner.setId(new Long(3));
		mechanicPartner.setDescription("Partenaire forfait A");
		mechanicPartner.setName("Remontee pro");
		
		
		administrationPassMechanicPartnerService.findAllPassByMechanicPartner(mechanicPartner);
	
		verify(passDao).findAll();
	}
	
	
	@Test
	public void testCanDeletePass(){
		Pass pass = new Pass();
		pass.setId(new Long(11));
		Track track = new Track();
		track.setId(new Long(1));
        track.setName("ToutSchuss standard");
        track.setDomain("ToutSchuss");
        track.setType("alpin");
		pass.setTrack(track);
		AgeCategory ageCategory = new AgeCategory();
		ageCategory.setId(new Long(1));
		ageCategory.setStartAge(0);
		ageCategory.setEndAge(14);
		ageCategory.setName("enfant");
		pass.setAgeCategory(ageCategory);
		Price price = new Price();
		price.setId(new Long(1));
		price.setPrice(100f);
		pass.setPrice(price);
		
		administrationPassMechanicPartnerService.deletePass(pass);	
		
		verify(passDao).delete(pass);
	}

	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateTrackWithoutType() throws MissingRequiredInformationException{
		Track track = new Track();
		track.setId(new Long(1));
        track.setName("ToutSchuss standard");
        track.setDomain("ToutSchuss");
		
		
		administrationPassMechanicPartnerService.saveTrack(track);
	}

	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateTrackWithoutDomain() throws MissingRequiredInformationException{
		Track track = new Track();
		track.setId(new Long(1));
        track.setName("ToutSchuss standard");
        track.setType("alpin");
		
		
		administrationPassMechanicPartnerService.saveTrack(track);
	}
	
	@Test(expected=MissingRequiredInformationException.class)
	public void testCannotCreateTrackWithoutName() throws MissingRequiredInformationException{
		Track track = new Track();
		track.setId(new Long(1));
		track.setDomain("ToutSchuss");
        track.setType("alpin");
		
		
		administrationPassMechanicPartnerService.saveTrack(track);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCannotSaveTrackWithNullTrack() throws MissingRequiredInformationException {
		
		administrationPassMechanicPartnerService.saveTrack(null);

	}
	
	@Test
	public void testCreateTrack() throws MissingRequiredInformationException{
		Track track = new Track();
		track.setId(new Long(1));
		track.setDomain("ToutSchuss");
        track.setType("alpin");
        track.setName("ToutSchuss standard");
		
		administrationPassMechanicPartnerService.saveTrack(track);
		
		verify(trackDao).save(track);
	}
	
	@Test
	public void testCanListTrack(){
		administrationPassMechanicPartnerService.findAll();
	
		verify(trackDao).findAll();
	}
	
	@Test
	public void testCanDeleteTrack(){
		Track track = new Track();
		track.setId(new Long(1));
        track.setName("ToutSchuss standard");
        track.setDomain("ToutSchuss");
        track.setType("alpin");
		
		administrationPassMechanicPartnerService.deleteTrack(track);	
		
		verify(trackDao).delete(track);
	}
	
	@Test
	public void testGetTrackById(){
		Long id=new Long(1);
		
		administrationPassMechanicPartnerService.getTrackById(id);
		
		verify(trackDao).findById(id);
	}
	
	@Test
	public void testGetPassById(){
		Long id=new Long(1);
		
		administrationPassMechanicPartnerService.getPassById(id);
		
		verify(passDao).findById(id);
	}
	
	@Test
	public void testCallListingToWhenStartDateNull() {
		Date startDate = null;
		Date endDate = new Date();
		
		administrationPassMechanicPartnerService.getMechanicPartnerListingBetween(startDate, endDate);
		
		verify(mechanicPartnerDao, times(2)).getMechanicPartnerListingBetween(any(Date.class), any(Date.class));
	}
	
	@Test
	public void testCallListingFromWhenEndDateNull() {
		Date startDate = new Date();
		Date endDate = null;
		
		administrationPassMechanicPartnerService.getMechanicPartnerListingBetween(startDate, endDate);
		
		verify(mechanicPartnerDao, times(2)).getMechanicPartnerListingBetween(any(Date.class), any(Date.class));
	}


	@Test
	public void testListingForComingWeekFillterToNextWeek() {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 7);
		
		administrationPassMechanicPartnerService.getMechanicPartnerListingForComingWeek();
				
		verify(mechanicPartnerDao).getMechanicPartnerListingBetween(any(Date.class), any(Date.class));
	}
	
	@Test
	public void testIfStartDateAndEndDateFilledCallPersistenceWithThoseParameters() {
		Date startDate = new Date();
		Date endDate = new Date();
		
		administrationPassMechanicPartnerService.getMechanicPartnerListingBetween(startDate, endDate);
		
		verify(mechanicPartnerDao).getMechanicPartnerListingBetween(any(Date.class), any(Date.class));
	}
}