package com.dreamit.proxystat.model.factory;

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Duration;
import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.Track;


public interface IPassFactory {

	/**
	 * instancie un objet Pass
	 * @return un objet Pass
	 */
	Pass createPass(Service service,Track track,Duration duration,AgeCategory ageCategory,Price price,Period period,MechanicPartner mechanicPartner,Boolean cautionReturned,Float cautionPrice);
}
