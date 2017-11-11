package com.dreamit.proxystat.model.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dreamit.proxystat.model.dao.IMechanicPartnerDAO;
import com.dreamit.proxystat.model.dao.IPassDAO;
import com.dreamit.proxystat.model.dao.ITrackDAO;
import com.dreamit.proxystat.model.dto.MechanicPartnerListing;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Track;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;
import com.dreamit.proxystat.model.service.IAdministrationPassMechanicPartnerService;

/**
 * 
 * @author rudy stienne
 *
 */
@Service(value = "administrationPassMechanicPartnerService")
@Transactional
public class AdministrationPassMechanicPartnerServiceImpl implements IAdministrationPassMechanicPartnerService{

	private static final int NEXT_WEEK_DAY_COUNTER = 7;
	
	@Autowired 
	private IPassDAO passDao;

	@Autowired 
	private ITrackDAO trackDao;

	@Autowired 
	private IMechanicPartnerDAO mechanicPartnerDao;

	/**
	 * le pass crée doit être attaché à un track, celui-ci lui sera attaché dans le controller
	 * @throws MissingRequiredInformationException 
	 */
	@Override
	public Pass savePass(Pass pass) throws MissingRequiredInformationException {
		checkPassValidity(pass);
		return passDao.save(pass);
	}


	private void checkPassValidity(Pass pass)
			throws MissingRequiredInformationException {
		if (pass == null) {
			throw new IllegalArgumentException();
		}

		AgeCategory ageCategory = pass.getAgeCategory();
		checkForNullAgeCategory(ageCategory);

		Price price = pass.getPrice();
		checkForNullPrice(price);

		String name = pass.getTrack().getName();
		checkForNullOrEmptyString(name);

		String type = pass.getTrack().getType();
		checkForNullOrEmptyString(type);

		String domain =pass.getTrack().getDomain();
		checkForNullOrEmptyString(domain);
	}

	private void checkForNullAgeCategory(AgeCategory ageCategory){
		if (ageCategory == null) {
			throw new IllegalArgumentException();
		}
	}

	private void checkForNullPrice(Price price){
		if (price == null) {
			throw new IllegalArgumentException();
		}
	}

	private void checkForNullOrEmptyString(String value)
			throws MissingRequiredInformationException {
		if (value == null || value.isEmpty()) {
			throw new MissingRequiredInformationException("name domain or type is null or empty");
		}
	}

	@Override
	public void deletePass(Pass pass) {
		passDao.delete(pass);	
	}

	@Override
	public List<Pass> findAllPassByMechanicPartner(MechanicPartner mechanicPartner) {
		List<Pass> listPass = passDao.findAll();
		List<Pass> listPassReturn = new ArrayList<Pass>();

		for (Pass pass : listPass) {
			if(pass.getMechanicPartner()!=null && mechanicPartner.getId().equals(pass.getMechanicPartner().getId())) {
				listPassReturn.add(pass);
			}
		}
		
		return listPassReturn;
	}

	private void checkTrackValidity(Track track)
			throws MissingRequiredInformationException {
		if (track == null) {
			throw new IllegalArgumentException();
		}

		String name = track.getName();
		checkForNullOrEmptyString(name);

		String type = track.getType();
		checkForNullOrEmptyString(type);

		String domain =track.getDomain();
		checkForNullOrEmptyString(domain);
	}


	@Override
	public Track saveTrack(Track track) throws MissingRequiredInformationException {
		checkTrackValidity(track);
		return trackDao.save(track);
	}

	@Override
	public void deleteTrack(Track track) {
		trackDao.delete(track);

	}

	@Override
	public List<Track> findAll() {
		return trackDao.findAll();
	}

	@Override
	public Track getTrackById(Long idTrack) {
		return trackDao.findById(idTrack);
	}




	@Override
	public Pass getPassById(Long idPass) {
		return passDao.findById(idPass);
	}


	@Override
	public List<MechanicPartnerListing> getMechanicPartnerListingBetween(
			Date startDate, Date endDate) {
		if (startDate == null) {
			getMechanicPartnerListingTo(endDate);
		}
		if (endDate == null) {
			getMechanicPartnerListingFrom(startDate);
		}
		
		return mechanicPartnerDao.getMechanicPartnerListingBetween(startDate, endDate);
	}


	@Override
	public List<MechanicPartnerListing> getMechanicPartnerListingFrom(
			Date startDate) {
			Date currentDate = new Date();
		
		return mechanicPartnerDao.getMechanicPartnerListingBetween(startDate, currentDate); 
	}


	@Override
	public List<MechanicPartnerListing> getMechanicPartnerListingTo(Date endDate) {
			Date currentDate = new Date();
		
		return mechanicPartnerDao.getMechanicPartnerListingBetween(currentDate, endDate); 
	}


	@Override
	public List<MechanicPartnerListing> getMechanicPartnerListingForComingWeek() {
		Calendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH, NEXT_WEEK_DAY_COUNTER);
		Date nextWeekDate = cal.getTime();
		Date currentDate = new Date();
		
		return mechanicPartnerDao.getMechanicPartnerListingBetween(currentDate, nextWeekDate);
	}



}
