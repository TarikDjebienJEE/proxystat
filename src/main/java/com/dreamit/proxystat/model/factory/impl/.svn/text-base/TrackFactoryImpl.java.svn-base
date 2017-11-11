package com.dreamit.proxystat.model.factory.impl;

import org.springframework.stereotype.Component;

import com.dreamit.proxystat.model.entities.Track;
import com.dreamit.proxystat.model.factory.ITrackFactory;

/**
 * 
 * @author rudy stienne
 *
 */

@Component(value = "trackFactory")
public class TrackFactoryImpl implements ITrackFactory{

	@Override
	public Track createTrack(String name, String domain, String type) {
		Track newTrack = new Track();
		newTrack.setName(name);
		newTrack.setDomain(domain);
		newTrack.setType(type);
		
			return newTrack;
	}

}
