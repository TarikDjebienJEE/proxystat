package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.ITrackDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Track;

/**
 * CRUD Implementation Track
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class TrackDAOImpl extends GenericJpaDataAccessObject<Track, Long> implements ITrackDAO {}
