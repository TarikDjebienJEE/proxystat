package com.dreamit.proxystat.model.exceptions;

/**
 * Season and period exception for date consistency
 * @author acraske
 *
 */
public class EndDateBeforeStartDateException extends Exception {

	/**
	 *  generated uid
	 */
	private static final long serialVersionUID = -5651867478943826983L;

	/**
	 * Default constructor
	 */
	public EndDateBeforeStartDateException() {
		super("End date have to be greater than start date");
	}
	
	/**
	 * constructor pouvant etre utilise depuis appel pour set le message
	 * @param message a attacher a l'exception
	 */
	public EndDateBeforeStartDateException(String message) {
		super(message);
	}
	
}
