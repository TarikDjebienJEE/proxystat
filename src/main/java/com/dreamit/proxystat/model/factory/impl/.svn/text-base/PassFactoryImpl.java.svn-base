package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.AgeCategory;
import com.dreamit.proxystat.model.entities.Duration;
import com.dreamit.proxystat.model.entities.MechanicPartner;
import com.dreamit.proxystat.model.entities.Pass;
import com.dreamit.proxystat.model.entities.Period;
import com.dreamit.proxystat.model.entities.Price;
import com.dreamit.proxystat.model.entities.Service;
import com.dreamit.proxystat.model.entities.Track;
import com.dreamit.proxystat.model.factory.IPassFactory;


/**
 * 
 * @author rudy stienne
 *
 */

@Component(value = "passFactory")
public class PassFactoryImpl implements IPassFactory{

	@Override
	public Pass createPass(Service service,Track track, Duration duration,
			AgeCategory ageCategory, Price price, Period period,
			MechanicPartner mechanicPartner, Boolean cautionReturned,
			Float cautionPrice) {
		Pass newPass = new Pass();
		newPass.setService(service);
		newPass.setTrack(track);
		newPass.setDuration(duration);
		newPass.setAgeCategory(ageCategory);
		newPass.setPrice(price);
		newPass.setPeriod(period);
		newPass.setMechanicPartner(mechanicPartner);
		newPass.setCautionReturned(cautionReturned);
		newPass.setCautionPrice(cautionPrice);
			return newPass;
	}

}
