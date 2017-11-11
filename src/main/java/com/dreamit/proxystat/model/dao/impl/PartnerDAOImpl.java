package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IPartnerDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Partner;

/**
 * CRUD Implementation Partner
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class PartnerDAOImpl extends GenericJpaDataAccessObject<Partner, Long> implements IPartnerDAO {}
