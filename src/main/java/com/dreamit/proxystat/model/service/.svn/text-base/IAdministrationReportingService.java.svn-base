package com.dreamit.proxystat.model.service;
import java.util.Map;

/**
 * Service necessaire au module administrateur de statistiques
 * @author RAKOTOBE Sitraka Eric
 *
 */
public interface IAdministrationReportingService {

	
	/**
	 * Methode permettant de charger toutes les semaines sur les 6 derniers mois
	 * @return une map contenant les semaines sur 6 derniers mois 
	 */
	Map<Integer, String> loadEventsWeekData();	
	

	/**
	 * Methode permettant de charger les donnees
	 * concernant la prediction du nombre de booking pour la semaine suivante
	 * @return nombre de booking pour la semaine suivante
	 */
	Integer loadNumberOfBookingPrediction();


	/**
	 * Methode permettant de connaitre le montant moyen paye par un client
	 * return le montant moyen paye par un client
	 */
	Integer loadAmountOfBookingOrder();
	
	
	
	
	/**
	 * Methode permettant de charger le nombre de booking
	 * @return une map contenant le nombre de booking 
	 */
	Map<Integer, Integer> loadCountBookingData();
	
	
	/**
	 * Methode permettant de charger le CA de booking
	 * @return une map contenant le CA de booking
	 */
	Map<Integer, Integer> loadTurnOverData();	
	
	
	/**
	 * Methode permettant de charger les marges de booking
	 * @return une map contenant les marges de booking
	 */
	Map<Integer, Integer> loadMarginData();		
	
	
	
	
	/**
	 * Methode permettant de charger le taux d'occupation d'appartements
	 * @return une map contenant le taux d'occupation d'appartements
	 */
	Map<Integer, Integer> loadOccupancyRateData();	
	
	
	
	/**
	 * Methode permettant de charger les types d'appartements les plus reserves
	 * @return une map contenant les types d'appartements les plus reserves
	 */
	Map<String, Integer> loadFlatTypeBookedData();		
	
	
	
	
	
	/**
	 * Methode permettant de charger les types d'equipements les plus reserves
	 * @return une map contenant les types d'equipements les plus reserves
	 */
	Map<String, Integer> loadEquipmentTypeData();		
		
	
	
	/**
	 * Methode permettant de charger les types de forfaits les plus commandes
	 * @return une map contenant les types de forfaits les plus commandes
	 */
	Map<String, Integer> loadPassTypeData();		
	
	
	/**
	 * Methode permettant de charger la moyenne des notes pour chaque service
	 * @return une map contenant les types de forfaits les plus commandes
	 */
	Map<String, Integer> loadRatingServiceData();	
	
	
	
	
	/**
	 * Methode permettant de charger les donnees 
	 * concernant les nouveaux clients
	 * @return une map contenant le nombre de booking 
	 */
	Map<Integer, Integer> loadNumberOfCustomersData();
	
	
	/**
	 * Methode permettant de charger la repartition des ages des differents invites
	 * @return une map contenant la repartition des ages des differents invites
	 */
	Map<String, Integer> loadGuestAgeBreakDownData();
		
	
}
