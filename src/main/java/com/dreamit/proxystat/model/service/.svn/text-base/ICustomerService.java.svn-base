package com.dreamit.proxystat.model.service;

import java.util.List;

import com.dreamit.proxystat.model.entities.Adress;
import com.dreamit.proxystat.model.entities.Customer;
import com.dreamit.proxystat.model.exceptions.MissingRequiredInformationException;

/**
 * @author Mélody, Rudy Stienne (recherche infos clients)
 *
 */
public interface ICustomerService {
	
	/** Permet d'enregistrer un customer
	 * @param customer
	 * @return retourne le customer qui vient d'être créé
	 * @throws MissingRequiredInformationException 
	 */
	Customer createCustomer(String name, String surname, String email,
			String adresseRue, String adresseCp, String adresseVille,
			String adressePays, String password, String passwordC)
			throws MissingRequiredInformationException,
			IllegalArgumentException;


	
	/**
	 * Methode retournant la liste de tous les customers 
	 * @return la liste de tous les customers
	 */	    

	List<Customer> findAll() ;
	

	
	/**Méthode permettant de supprimer un customer
	 * @param customer à supprimer
	 */
	void deleteCustomer(Customer customer);
	

	
	/** permet de retrouver un customer grâce à son id
	 * @param id 
	 * @return customer correpondant à l'id
	 */
	Customer findById(long id);

	
	/**
	 * Valide les informations d’un compte client
	 * @param Email  Email dont le format doit être validé
	 * @return vrai(true) si les informations sont valides ou faux(false) si invalides
	 */
	void validateEmail (String email)throws MissingRequiredInformationException;;


	/**
	 * Valide que les deux mots de passe sont identiques
	 * @param password1  Premier mot de passe
	 * @param password2  Mot de passe de vérification
	 * @return vrai(true) si les deux mot de passe sont identiques ou faux(false) si différents
	 */
	void compareTwoPassword (String password1, String password2) throws MissingRequiredInformationException;;


	
	/** Permet d'enregistrer l'adresse d'un customer
	 * @param adresse
	 * @return retourne l'adresse qui vient d'être créé
	 */
	Adress createAdress(Adress adress);
	

	/**
	 * @author : rudy stienne
	 * @param name nom du client
	 * @param surname prenom du client
	 * @return le client ou les clients correspondant à son nom et prenom
	 */
	List<Customer> findByNameAndSurname(String name, String surname);

    
}
