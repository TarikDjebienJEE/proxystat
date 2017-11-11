package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.ITrainingPartnerDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.TrainingPartner;

/**
 * CRUD Implementation Adress
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class TrainingPartnerDAOImpl extends GenericJpaDataAccessObject<TrainingPartner, Long> implements ITrainingPartnerDAO {}
