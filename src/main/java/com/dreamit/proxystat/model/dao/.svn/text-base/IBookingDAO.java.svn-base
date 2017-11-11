package com.dreamit.proxystat.model.dao;
import java.util.Date;
import java.util.Map;

import com.dreamit.proxystat.model.dao.pattern.GenericDataAccessObject;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.FlatType;
import com.dreamit.proxystat.model.entities.Pass;


/**
 * DAO IBookingDAO
 * @author RAKOTOBE Sitraka Eric
 */
public interface IBookingDAO extends GenericDataAccessObject<Booking, Long>{
	
	
	/**
	 * Methode permettant de retourner le nombre de booking
	 * prevu pour la semaine prochaine
	 * @return le nombre de booking dont bookingDate est entre startdate et enddate
	 */
	Integer loadNumberOfBookingPrediction();
	
	
	/**
	 * Methode permettant de retourner le montant moyen de commande
	 * @return le montant moyen de commande
	 */	
	Integer loadAmountOfBookingOrder();
	
	
	/**
	 * Methode permettant de retourner le nombre de booking
	 * dont le bookingDate se trouve entre une date de debut et 
	 * une date de fin
	 * @param startDate : la date de debut
	 * @param endDate : la date de fin
	 * @return le nombre de booking dont bookingDate est entre startdate et enddate
	 */
	Integer getCountBookingBetween(Date startDate, Date endDate);	
	
	
	/**
	 * Methode permettant de retourner le chiffre d'affaire realise pour le 
	 * nombre de booking entre une date de debut et une date de fin
	 * Pour chaque mois, on effectue la somme de tous les bookings 
	 * a condition que celles ci n'aient pas ete annules
	 * @param startDate : la date de debut
	 * @param endDate : la date de fin
	 * @return le chiffre d'affaire realise entre startdate et enddate
	 */
	Integer getBookingTurnOverBetween(Date startDate, Date endDate);	
	
	
	
	/**
	 * Methode permettant de retourner les marges realises pour les
	 * booking entre une date de debut et une date de fin
	 * @param startDate : la date de debut
	 * @param endDate : la date de fin
	 * @return les marges realises
	 */
	Integer getBookingMarginBetween(Date startDate, Date endDate);	
	
	
	
	/**
	 * Methode permettant de charger les types d'appartements les plus reserves
	 * @return une map contenant les types d'appartements les plus reserves
	 */
	Map<FlatType, Integer> loadFlatTypeBookedData();		
	
	
	/**
	 * Methode permettant de charger les types d'equipements les plus reserves
	 * @return une map contenant les types d'equipements les plus reserves
	 */
	Map<Equipment, Integer> loadEquipmentTypeData();
	
	
	
	/**
	 * Methode permettant de charger les types de forfaits les plus commandes
	 * @return une map contenant les types de forfaits les plus commandes
	 */
	Map<Pass, Integer> loadPassTypeData();	
	
	
	/**
	 * Methode permettant de charger la moyenne des notes pour chaque service
	 * @return une map contenant les types de forfaits les plus commandes
	 */
	Map<String, Integer> loadRatingServiceData();
	
	
	/**
	 * Methode permettant de retourner le nombre de nouveaux clients
	 * dont le bookingDate se trouve entre une date de debut et 
	 * une date de fin
	 * @param startDate : la date de debut
	 * @param endDate : la date de fin
	 * @return le nombre de nouveaux clients dont bookingDate est entre startdate et enddate
	 */
	Integer getNumberOfCustomersBetween(Date startDate, Date endDate);	
	
}
