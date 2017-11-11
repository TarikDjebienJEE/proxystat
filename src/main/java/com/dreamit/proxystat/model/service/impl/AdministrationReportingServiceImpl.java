package com.dreamit.proxystat.model.service.impl;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dreamit.proxystat.model.dao.IAgeCategoryDAO;
import com.dreamit.proxystat.model.dao.IBookingDAO;
import com.dreamit.proxystat.model.dao.IFlatDAO;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.FlatType;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.service.IAdministrationReportingService;

@Transactional
@Service(value = "administrationReportingService")
public class AdministrationReportingServiceImpl implements IAdministrationReportingService {

	
	/**
	 * Attribut representant le nombre de derniers semaines 
	 * pour les statistiques :
	 * Nous voulons les statistiques pour les 24 derniers semaines
	 * depuis la date d'aujourd'hui
	 */
	public static final int NB_WEEKS = 5 ; 

	@Autowired
	private IBookingDAO bookingDAO;
	
	@Autowired
	private IFlatDAO flatDAO;
	
	@Autowired
	private IAgeCategoryDAO ageCategoryDao;	
	
	
	
	/**
	 * Methode iterant sur une map pour avoir la valeur
	 * correspondant a une cle passee en parametre
	 */
	private Date findDateByKey(Integer keyValue , Map<Integer, Date> mapData){
		Date result = null ; 
		for (Integer key : mapData.keySet()){
			if (key != null && key.equals(keyValue)){
				result = mapData.get(key);
			}
		}
		return result ; 
	}
	
	
	/**
	 * Methode permettant de transformer une date d'un format
	 * "Fri Feb 22 15:51:02 CET 2013" dans un format "dd/mm/yyyy"
	 * Par exemple "Fri Feb 22 15:51:02 CET 2013" => 22/02/2013
	 * @param date : la date en entree, au format "Fri Feb 22 15:51:02 CET 2013"
	 * @return : la date au format "dd/mm/yyyy"
	 */
	public static String transformDateToMonthYearFormat(Date date){
		Calendar calendar = Calendar.getInstance(new Locale("fr"));
		calendar.setTime(date);
		return new SimpleDateFormat("dd/MM/yyyy").format(date) ;
	}	
    
    
   /**
    * Methode permettant d'avoir la liste des dernieres semaines sur les 6 derniers mois
    * @param nbWeek : le nombre de semaines voulue
    * @return : la liste des dernieres semaines sur les 6 derniers mois
    */
    private Map<Integer, String> getLastsWeeks(int nbWeek){
        Date date = Calendar.getInstance().getTime() ; 
        Map<Integer, String> result = new TreeMap<Integer, String>();
        Calendar calendar = Calendar.getInstance(Locale.FRENCH);
        calendar.setTime(date);
        int day = calendar.get(Calendar.WEEK_OF_YEAR);
        int month = calendar.get(Calendar.MONTH) ;
        int year = calendar.get(Calendar.YEAR) ;
        int index = 1 ;
        for (int i = nbWeek ; i>=0 ; i--){
        	calendar.set(Calendar.WEEK_OF_YEAR, day - i);
            calendar.set(Calendar.MONTH, month) ;
            calendar.set(Calendar.YEAR,year);
            result.put(index, transformDateToMonthYearFormat(calendar.getTime())) ;
            index ++ ; 
        }
        return result;
    }   	
	
    
    /**
     * Methode permettant d'avoir la liste des dernieres semaines sur les 6 derniers mois
     * @param nbWeek : le nombre de semaines voulues
     * @return : la liste des dernieres semaines sur les 6 derniers mois
     */
     private Map<Integer, Date> getLastsWeeksInDateFormat(int nbWeek){
         Date date = Calendar.getInstance().getTime() ; 
         Map<Integer, Date> result = new TreeMap<Integer, Date>();
         Calendar calendar = Calendar.getInstance(Locale.FRENCH);
         calendar.setTime(date);
         int day = calendar.get(Calendar.WEEK_OF_YEAR);
         int month = calendar.get(Calendar.MONTH) ;
         int year = calendar.get(Calendar.YEAR) ;
         int index = 1 ;
         for (int i = nbWeek ; i>=0 ; i--){
         	calendar.set(Calendar.WEEK_OF_YEAR, day - i);
             calendar.set(Calendar.MONTH, month) ;
             calendar.set(Calendar.YEAR,year);
             result.put(index, calendar.getTime()) ;
             index ++ ; 
         }
         return result;
     }       
    
	
	@Override
	public Map<Integer, String> loadEventsWeekData() {
		return getLastsWeeks(AdministrationReportingServiceImpl.NB_WEEKS);
	}	
	

	@Override
	public Integer loadNumberOfBookingPrediction() {
		return bookingDAO.loadNumberOfBookingPrediction();
	}


	@Override
	public Integer loadAmountOfBookingOrder() {
		return bookingDAO.loadAmountOfBookingOrder();
	}
	
	
	
	@Override
	public Map<Integer, Integer> loadCountBookingData() {
    	Map<Integer, Integer> countBookingData = new HashMap<Integer, Integer>();
    	Map<Integer, Date> weekData = getLastsWeeksInDateFormat(AdministrationReportingServiceImpl.NB_WEEKS);
    	for (Integer key : weekData.keySet()) {
    		Integer lastValue = 0 ; 
    		if (key - 1 > 0){
    			lastValue = key - 1 ; 
    		}
    		Date dateStart = findDateByKey(lastValue, weekData);
    		Date dateEnd = findDateByKey(key, weekData);
    		Integer countBookingInDate = bookingDAO.getCountBookingBetween(dateStart,dateEnd);
    		countBookingData.put(key, countBookingInDate);
		}
        return countBookingData ; 
	}


	@Override
	public Map<Integer, Integer> loadTurnOverData() {
    	Map<Integer, Integer> turnOverData = new HashMap<Integer, Integer>();
    	Map<Integer, Date> weekData = getLastsWeeksInDateFormat(AdministrationReportingServiceImpl.NB_WEEKS);
    	for (Integer key : weekData.keySet()) {
    		Integer lastValue = 0 ; 
    		if (key - 1 > 0){
    			lastValue = key - 1 ; 
    		}
    		Date dateStart = findDateByKey(lastValue, weekData);
    		Date dateEnd = findDateByKey(key, weekData);
    		Integer turnOverInDate = bookingDAO.getBookingTurnOverBetween(dateStart,dateEnd);
    		turnOverData.put(key, turnOverInDate);
		}
        return turnOverData ; 
	}


	@Override
	public Map<Integer, Integer> loadMarginData() {
    	Map<Integer, Integer> marginData = new HashMap<Integer, Integer>();
    	Map<Integer, Date> weekData = getLastsWeeksInDateFormat(AdministrationReportingServiceImpl.NB_WEEKS);
    	for (Integer key : weekData.keySet()) {
    		Integer lastValue = 0 ; 
    		if (key - 1 > 0){
    			lastValue = key - 1 ; 
    		}
    		Date dateStart = findDateByKey(lastValue, weekData);
    		Date dateEnd = findDateByKey(key, weekData);
    		Integer marginInDate = bookingDAO.getBookingMarginBetween(dateStart,dateEnd);
    		marginData.put(key, marginInDate);
		}
        return marginData ; 
	}


	@Override
	public Map<Integer, Integer> loadOccupancyRateData() {
    	Map<Integer, Integer> occupancyRateData = new HashMap<Integer, Integer>();
    	Map<Integer, Date> weekData = getLastsWeeksInDateFormat(AdministrationReportingServiceImpl.NB_WEEKS);
    	for (Integer key : weekData.keySet()) {
    		Integer lastValue = 0 ; 
    		if (key - 1 > 0){
    			lastValue = key - 1 ; 
    		}
    		Date dateStart = findDateByKey(lastValue, weekData);
    		Date dateEnd = findDateByKey(key, weekData);
    		Integer occupancyRateInDate = flatDAO.getRateOccupancyBetween(dateStart, dateEnd);
    		occupancyRateData.put(key, occupancyRateInDate);
		}
        return occupancyRateData ; 
	}

	

	@Override
	public Map<String, Integer> loadFlatTypeBookedData() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		Map<FlatType, Integer> mapFlatType =  bookingDAO.loadFlatTypeBookedData() ;
		for (FlatType flatType : mapFlatType.keySet()) {
			if (flatType.getService() != null && "".equals(flatType.getService().getName()) || flatType.getService().getName()== null){
				result.put("Unknown", mapFlatType.get(flatType));
			}else{
				result.put(flatType.getService().getName(), mapFlatType.get(flatType));
			}
		}
		return result ; 
	}


	@Override
	public Map<String, Integer> loadEquipmentTypeData() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		Map<Equipment, Integer> mapEquipment =  bookingDAO.loadEquipmentTypeData() ;
		for (Equipment equipment : mapEquipment.keySet()) {
			if (equipment.getService() != null && "".equals(equipment.getService().getName()) || equipment.getService().getName()== null){
				result.put("Unknown", mapEquipment.get(equipment));
			}else{
				result.put(equipment.getService().getName(), mapEquipment.get(equipment));
			}
		}
		return result ; 
	}


	@Override
	public Map<String, Integer> loadPassTypeData() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		Map<Pass, Integer> mapPass =  bookingDAO.loadPassTypeData() ;
		for (Pass pass : mapPass.keySet()) {
			if (pass.getService() != null && "".equals(pass.getService().getName()) || pass.getService().getName()== null){
				result.put("Unknown", mapPass.get(pass));
			}else{
				result.put(pass.getService().getName(), mapPass.get(pass));
			}
		}
		return result ; 
	}


	@Override
	public Map<String, Integer> loadRatingServiceData() {
		return bookingDAO.loadRatingServiceData();
	}


	@Override
	public Map<Integer, Integer> loadNumberOfCustomersData() {
    	Map<Integer, Integer> numberOfCustomersData = new HashMap<Integer, Integer>();
    	Map<Integer, Date> weekData = getLastsWeeksInDateFormat(AdministrationReportingServiceImpl.NB_WEEKS);
    	for (Integer key : weekData.keySet()) {
    		Integer lastValue = 0 ; 
    		if (key - 1 > 0){
    			lastValue = key - 1 ; 
    		}
    		Date dateStart = findDateByKey(lastValue, weekData);
    		Date dateEnd = findDateByKey(key, weekData);
    		Integer countBookingInDate = bookingDAO.getNumberOfCustomersBetween(dateStart,dateEnd);
    		numberOfCustomersData.put(key, countBookingInDate);
		}
        return numberOfCustomersData ;
	}


	@Override
	public Map<String, Integer> loadGuestAgeBreakDownData() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		Map<AgeCategory, Integer> mapAgeCategory =  ageCategoryDao.loadGuestAgeBreakDown() ;
		for (AgeCategory ageCategory : mapAgeCategory.keySet()) {
			if (ageCategory.getName() == null ){
				result.put("Unknown", mapAgeCategory.get(ageCategory));
			}else{
				result.put(ageCategory.getName(), mapAgeCategory.get(ageCategory));
			}
		}
		return result ; 
	}	
}