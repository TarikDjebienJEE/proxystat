package com.dreamit.proxystat.model.service;

import java.util.Date;
import java.util.List;

import com.dreamit.proxystat.model.dto.Basket;
import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Booking;
import com.dreamit.proxystat.model.entities.Equipment;
import com.dreamit.proxystat.model.entities.Flat;
import com.dreamit.proxystat.model.entities.Guest;
import com.dreamit.proxystat.model.entities.Option;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.PaymentCredit;
import com.dreamit.proxystat.model.entities.TrainingCourse;

/**
 * Service for validation booking flat, equipment and pass
 * @author tarik DJEBIEN
 *
 */
public interface IBookingService {
	
    /**
     * Methode permettant d'avoir la liste des appartements
     * disponibles entre une date de debut et une date de fin en parametre
     * Filtrage des flats disponibles (avalaible) entre date debut et date de fin
     * Filtrage des flats lies a aucun booking
     * @param startDate la date de debut
     * @param endDate la date de fin
     * @return liste des appartements
     */
	List<Flat> getFlatAvalaible(Date startDate , Date endDate) ; 

	
    /**
     * Methode permettant d'avoir la liste des appartements
     * disponibles entre une date de debut et une date de fin en parametre
     * Filtrage des flats disponibles (avalaible) entre date debut et date de fin
     * Filtrage des flats lies a aucun booking
     * @param startDate la date de debut
     * @param endDate la date de fin
     * @param price prix voulu
     * @return liste des appartements
     */
	List<Flat> getFlatAvalaible(Date startDate , Date endDate, Float price) ; 	
	
    /**
     * Methode permettant d'ajouter une somme 
     * a un panier
     * @param basket: le panier
     * @param price : le prix a ajouter
     * @return le panier mis a jour
     */
	Basket addPrice(Basket basket, Float price);
	
	
    /**
     * Methode retournant le prix total d'un panier
     * @param b : le panier
     * @return le prix total du panier
     */
	Float getTotalAmount(Basket b) ; 
	
    /**
     * Methode retournant les types de cartes disponibles
     * @return la liste des cartes disponibles
     */
	List<PaymentCredit> getCardAvalaible();	
	
	
	/**
	 * Create an Order and persist a booking in DataBase
	 * @param basket
	 */
	Booking createOrder(Basket basket);
	
	/**
	 * Get total amounts for all option selected
	 * @param optionsSelected
	 * @return
	 */
	Float getOptionsPrice(List<Option> optionsSelected);
	
	/**
	 * methode qui retrourne la liste des options possibles pour les services
	 * @return List<Option>
	 */
	List<Option> getListOption();
	
	/**
	 * méthode qui vérifie la validité d'un mode de paiement et ensuite effectue le paiement 
	 * @param typeCard
	 * @param numberOfCard
	 * @param expiration
	 * @return true
	 */
	boolean payment (String typeCard,int numberOfCard, Date expiration);
	
	/**
	 * methode qui retourne le montant de l'accompte du panier
	 * @param basket
	 * @return montant de l'accompte
	 */
	Float getDeposit (Basket basket);

	/**
	 * Get All guest type :
	 * - Adulte
	 * - Enfant
	 * - bébé
	 * @return
	 */
	List<AgeCategory> getAllGuestType();
	
	/**
	 * Get All equipments 
	 */	
	List<Equipment> getAllEquipments();
	
	
	/**
	 * Get All equipments availables for the corresponding criterias
	 * @param typePersonne
	 * @param personheight
	 * @param shoesSize
	 * @return
	 */
	List<Equipment> getAllCorrespondingEquipments(AgeCategory typePersonne, Integer personheight, Integer shoesSize);

	/**
	 * Get total amounts for all equipments selected
	 * @param equipmentsSelected
	 * @return
	 */
	Float getEquipmentsPrice(List<Equipment> equipmentsSelected);
	
	/**
	 * Recupere la liste des types forfaits de remontee mecaniques disponibles
	 * @return la liste des types forfaits de remontee mecaniques disponibles
	 */
	List<Pass> getAllTrackAvailable();
	
	
	/**
	 * Recupere la liste des ages categories
	 * de la bdd
	 * @return la liste des ages categories
	 */
	List<AgeCategory> getAllAgeCategory();
	
	
    /**
     * Methode retournant les categories d'age
     * avec le nom en parametre
     * @param ageCategoryName : le nom de la categorie (enfant, adulte, senior)
     * @return les categories d'age repondant au critere nom
     */
	 List<AgeCategory> findByNameAgeCategory(String ageCategoryName) ; 
	 
	
	
	/**
	 * dixit antoine par mail : cette méthode doit lier pour un guest appartenant à un booking son pass - dans la modélisation actuelle 1 guest peut avoir 0 ou 1 forfait
	 * TODO Antoine, alors la je suis pas sur du tout des entites, voir si c'est OK et si j'ai pas oublie
	 * des parametres pour la methodes en fonction de la page 23 des specs, correspondant aux 3 blocs de chaques forfaits.
	 * Dans la Factory 
	 *  le cautionReturned doit etre à false
	 *  le cautionPrice est par default a deux euros
	 * Creation et enregistrement d'une reservation d'un forfait
	 * @param typeDeForfait
	 * @param dureeChoisie
	 * @param fullSeason
	 * @return
	 */
	Pass createPassBooking(Booking booking, Guest guest,Pass pass);

	/**
	 * Recupere la liste des options correspondant au ids
	 * @param optionsId
	 * @return
	 */
	List<Option> getOptionsById(long[] optionsId);
	
	/**
	 * 
	 * @param id
	 * @return booking found or null
	 */
	Booking findBookingById(Long id);
	
	/**
	 * Cancel the booking
	 * @param booking
	 * @return saved booking
	 */
	Booking cancelBooking(Booking booking);
	
	
	/**
	 * Return all trainingcourse in database
	 * @return all trainingcourse in database
	 */
	 List<TrainingCourse> getAllTrainingCourse();	
	 
	 
	/**
	 * Return all Pass in database
	 * @return all Pass in database
	 */
	List<Pass> getAllPass();
	 
	 
	/**
	 * Methode permettant de lier des equipements, pass, et trainingcours a 
	 * un guest et de retourner le guest ainsi cree
	 * @return guest avec bonnes cles vers autres tables 
	 */
	 Guest setLinkGuest(String name , String [] equipmentChoice,  String passChoice, String trainingCourseChoice );
	 
	/**
	 * Methode retournant un flat correspondant a l'id en parametre
	 * @param idFlat : l'id du flat a chercher
	 * @return le flat avec l'id en parametre
	 */
	Flat findById(Long idFlat);
	
}
