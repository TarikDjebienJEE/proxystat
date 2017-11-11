package com.dreamit.proxystat.model.exceptions;

/**
 * Season and period exception for date consistency
 * Throws when try to create or save a period or season on existing timeframe 
 * @author acraske
 *
 */
public class TimeframeAlreadyUseException extends Exception {

	/**
	 *  generated uid
	 */
	private static final long serialVersionUID = -5651867478943826983L;

	/**
	 * Default constructor
	 */
	public TimeframeAlreadyUseException() {
		super("Start date or end date is between an existing season or period");
	}
	
	/**
	 * constructor pouvant etre utilise depuis appel pour set le message
	 * @param message a attacher a l'exception
	 */
	public TimeframeAlreadyUseException(String message) {
		super(message);
	}
	
}
