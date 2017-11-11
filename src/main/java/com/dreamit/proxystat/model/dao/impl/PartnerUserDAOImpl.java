package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IPartnerUserDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.PartnerUser;

/**
 * CRUD Implementation PartnerUser
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class PartnerUserDAOImpl extends GenericJpaDataAccessObject<PartnerUser, Long> implements IPartnerUserDAO {}
