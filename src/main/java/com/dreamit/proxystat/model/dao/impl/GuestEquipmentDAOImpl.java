package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;

import com.dreamit.proxystat.model.dao.IGuestEquipmentDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.GuestEquipment;

/**
 * CRUD Implementation Equipment
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class GuestEquipmentDAOImpl extends GenericJpaDataAccessObject<GuestEquipment, Long> implements IGuestEquipmentDAO {}
