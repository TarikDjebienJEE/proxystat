package com.dreamit.proxystat.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dreamit.proxystat.model.dao.IAgeCategoryDAO;
import com.dreamit.proxystat.model.dao.ICustomerDAO;
import com.dreamit.proxystat.model.dao.IDurationDAO;
import com.dreamit.proxystat.model.dao.IPassDAO;
import com.dreamit.proxystat.model.dao.IPeriodDAO;
import com.dreamit.proxystat.model.dao.IPriceDAO;
import com.dreamit.proxystat.model.dao.IServiceDAO;
import com.dreamit.proxystat.model.dao.IUserDAO;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.entities.Duration;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.User;
import com.dreamit.proxystat.model.service.IAdministrationCommonService;

@Service(value = "administrationCommonService")
@Transactional
public class AdministrationCommonServiceImpl implements IAdministrationCommonService {

	@Autowired
	private IAgeCategoryDAO ageCategoryDao;
	
	@Autowired
	private IPeriodDAO periodDao;
	
	@Autowired
	private IPriceDAO priceDao;
	
	@Autowired
	private IServiceDAO serviceDao;
	
	@Autowired 
	private IDurationDAO durationDao;
	
	@Autowired 
	private IPassDAO passDao;
	
	@Autowired
	private IUserDAO userDao;
	
	@Autowired
	private ICustomerDAO customerDao;
	
	@Override
	public List<AgeCategory> findAllAgeCategory() {
		return ageCategoryDao.findAll();
	}

	@Override
	public AgeCategory findAgeCategoryById(Long id) {
		return ageCategoryDao.findById(id);
	}

	@Override
	public AgeCategory saveAgeCategory(AgeCategory ageCategory) {
		return ageCategoryDao.save(ageCategory);
	}

	@Override
	public void deleteAgeCategory(AgeCategory ageCategory) {
		ageCategoryDao.delete(ageCategory);
	}

	
	@Override
	public List<Period> findAllPeriod() {
		return periodDao.findAll();
	}

	@Override
	public Period findPeriodById(Long id) {
		return periodDao.findById(id);
	}

	@Override
	public Period savePeriod(Period period) {
		return periodDao.save(period);
	}

	@Override
	public void deletePeriod(Period period) {
		periodDao.delete(period);
	}

	
	@Override
	public List<Price> findAllPrice() {
		return priceDao.findAll();
	}

	@Override
	public Price findPriceById(Long id) {
		return priceDao.findById(id);
	}

	@Override
	public Price savePrice(Price price) {
		return priceDao.save(price);
	}

	@Override
	public void deletePrice(Price price) {
		priceDao.delete(price);
	}

	@Override
	public List<com.dreamit.proxystat.model.entities.Service> findAllServices() {
		return serviceDao.findAll();
	}

	@Override
	public com.dreamit.proxystat.model.entities.Service findServiceById(Long id) {
		return serviceDao.findById(id);
	}

	@Override
	public com.dreamit.proxystat.model.entities.Service saveService(
			com.dreamit.proxystat.model.entities.Service service) {
		return serviceDao.save(service);
	}

	@Override
	public void deleteService(
			com.dreamit.proxystat.model.entities.Service service) {
		serviceDao.delete(service);
	}

	@Override
	public List<Duration> getAllDurations() {
		return durationDao.findAll();
	}


	@Override
	public Duration getDurationById(Long idDuration) {
		return durationDao.findById(idDuration);
	}

	@Override
	public List<User> findUserByExample(User sampleInstance) {
		if (sampleInstance == null) {
			throw new IllegalArgumentException("example should not be null");
		}
		
		return userDao.findByExample(sampleInstance);
	}

	@Override
	public Customer findCustomerByUser(User user) {
		if (user == null) {
			throw new IllegalArgumentException("user is null");
		}
		
		return customerDao.findCustomerByUser(user);
	}

	@Override
	public Pass findPassById(Long id) {
		return passDao.findById(id);
	}
	
	
	@Override
	public List<Pass> findAllPass() {
		return passDao.findAll();
	}

}