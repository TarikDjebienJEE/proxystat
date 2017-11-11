package com.dreamit.proxystat.model.enumeration;

/**
 * Enumeration for Spring Security Role enabled
 * 
 * @author tarik DJEBIEN
 *
 */
public enum ERole {
	
	ADMIN("ROLE_ADMIN"),
	USER("ROLE_USER"),
	PARTNER_SPORT("ROLE_PARTNER_SPORT"),
	PARTNER_PASS("ROLE_PARTNER_PASS"), 
	PARTNER_TRAINING ("ROLE_PARTNER_TRAINING");
	
	private final String authoritiesSpringSecurity;
	
	/**
	 * Constructeur d'initialisation
	 * @param authority
	 */
	ERole(String authority){
		this.authoritiesSpringSecurity = authority;
	}

	/**
	 * @return the authoritiesSpringSecurity
	 */
	public String getAuthoritiesSpringSecurity() {
		return authoritiesSpringSecurity;
	}

}
