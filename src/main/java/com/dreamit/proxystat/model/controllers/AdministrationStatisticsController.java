package com.dreamit.proxystat.model.controllers;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dreamit.proxystat.model.service.IAdministrationReportingService;
import com.dreamit.proxystat.view.SpringViewResolutionConstants;

/**
 * Controlleur pour les administrations des statistiques
 * @author RAKOTOBE Sitraka Eric
 */
@Controller
@RequestMapping(value = "*.reporting")
@Scope(value = "singleton")
public class AdministrationStatisticsController {
	

	@Autowired
	private IAdministrationReportingService administrationReportingService;	
	
	
	/**
	 * Methode retournant la vue des statistiques
	 * et initialisant les donnees utiles au statistiques
	 * @param request
	 * @param model
	 * @return statistics view
	 */
	@RequestMapping(value="/adminStatistics")
	public String getAdminStatisticsView(HttpServletRequest request, ModelMap model) {
		
		loadNumberOfBookingPrediction(model);
		loadAmountOfBookingOrder(model);
		loadEventsWeekData(model);
		loadCountBookingData(model);
		loadTurnOverData(model);
		loadMarginData(model);
		loadOccupancyRateData(model);
		loadFlatTypeBookedData(model);
		loadEquipmentTypeData(model);
		loadPassTypeData(model);
		loadRatingServiceData(model);
		loadNumberOfCustomersData(model);
		loadGuestAgeBreakDownData(model);
		return  SpringViewResolutionConstants.VIEW_ADMIN_STATISTICS;
    }
	
	
	
	/**
	 * Methode permettant de charger les donnees
	 * concernant la prediction du nombre de booking pour la semaine suivante
	 * @param model
	 */
    private void loadNumberOfBookingPrediction(ModelMap model) {
    	Integer numberOfBookingPredictionOfNextWeek = administrationReportingService.loadNumberOfBookingPrediction();
        model.put("numberOfBookingPredictionOfNextWeek", numberOfBookingPredictionOfNextWeek);
    }		
	
    
	/**
	 * Methode permettant de charger le montant moyen de commande
	 * @param model
	 */
    private void loadAmountOfBookingOrder(ModelMap model) {
    	Integer amountOfBookingOrder = administrationReportingService.loadAmountOfBookingOrder();
        model.put("amountOfBookingOrder", amountOfBookingOrder);
    }	
    
    
	/**
	 * Methode permettant de charger les donnees
	 * concernant les semaines 
	 * (representera les absisses xDataValue)
	 * @param model
	 */
    private void loadEventsWeekData(ModelMap model) {
    	Map<Integer, String> weekData = administrationReportingService.loadEventsWeekData();
        model.put("weekData", weekData);
    }	
    
    
	/**
	 * Methode permettant de charger les donnees 
	 * concernant les bookings
	 * (representera les ordonnees yDataValue)
	 * @param model
	 */
    private void loadCountBookingData(ModelMap model) {
    	Map<Integer, Integer> countBookingData = administrationReportingService.loadCountBookingData();
        model.put("countBookingData", countBookingData);
    }	
    
   
	/**
	 * Methode permettant de charger les donnees 
	 * concernant le CA 
	 * (representera les ordonnees yDataValue)
	 * @param model
	 */
    private void loadTurnOverData(ModelMap model) {
    	Map<Integer, Integer> turnOverData = administrationReportingService.loadTurnOverData();
        model.put("turnOverData", turnOverData);
    }	    
    
    
    
	/**
	 * Methode permettant de charger les donnees 
	 * concernant les marges des bookings
	 * (representera les ordonnees yDataValue)
	 * @param model
	 */
    private void loadMarginData(ModelMap model) {
    	Map<Integer, Integer> marginData = administrationReportingService.loadMarginData();
        model.put("marginData", marginData);
    }	     
    
    
    
    
	/**
	 * Methode permettant de charger le taux d'occupation d'appartements
	 * (representera les ordonnees yDataValue)
	 * @param model
	 */
    private void loadOccupancyRateData(ModelMap model) {
    	Map<Integer, Integer> occupancyRateData = administrationReportingService.loadOccupancyRateData() ; 
        model.put("occupancyRateData", occupancyRateData);
    }	     
        
    
    
	/**
	 * Methode permettant de charger les types d'appartements les plus reserves
	 * @param model
	 */
    private void loadFlatTypeBookedData(ModelMap model) {
    	Map<String, Integer> flatTypeBookedData = administrationReportingService.loadFlatTypeBookedData() ; 
        model.put("flatTypeBookedData", flatTypeBookedData);
    }    
    
    
    
	/**
	 * Methode permettant de charger les types d'equipements les plus commandes
	 * @param model
	 */
    private void loadEquipmentTypeData(ModelMap model) {
    	Map<String, Integer> equipmentTypeData = administrationReportingService.loadEquipmentTypeData() ; 
        model.put("equipmentTypeData", equipmentTypeData);
    }        
    
    
    
    
	/**
	 * Methode permettant de charger les types de forfaits les plus commandes
	 * @param model
	 */
    private void loadPassTypeData(ModelMap model) {
    	Map<String, Integer> passTypeData = administrationReportingService.loadPassTypeData() ; 
        model.put("passTypeData", passTypeData);
    }            
    
    
    
    
	/**
	 * Methode permettant de charger la moyenne des notes pour chaque service
	 * @param model
	 */
    private void loadRatingServiceData(ModelMap model) {
    	Map<String, Integer> ratingServiceData = administrationReportingService.loadRatingServiceData() ; 
        model.put("ratingServiceData", ratingServiceData);
    }           
    
    
    
	/**
	 * Methode permettant de charger les donnees 
	 * concernant les nouveaux clients
	 * (representera les ordonnees yDataValue)
	 * @param model
	 */
    private void loadNumberOfCustomersData(ModelMap model) {
    	Map<Integer, Integer> numberOfCustomersData = administrationReportingService.loadNumberOfCustomersData();
        model.put("numberOfCustomersData", numberOfCustomersData);
    }	
     
    
    
    
	/**
	 * Methode permettant de charger les donnees 
	 * concernant les nouveaux clients
	 * (representera les ordonnees yDataValue)
	 * @param model
	 */
    private void loadGuestAgeBreakDownData(ModelMap model) {
    	Map<String, Integer> guestAgeBreakDownData = administrationReportingService.loadGuestAgeBreakDownData();
        model.put("guestAgeBreakDownData", guestAgeBreakDownData);
    }	    
    
    
	
}