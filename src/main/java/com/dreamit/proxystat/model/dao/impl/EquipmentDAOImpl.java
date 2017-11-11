package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IEquipmentDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Equipment;

/**
 * CRUD Implementation Equipment
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class EquipmentDAOImpl extends GenericJpaDataAccessObject<Equipment, Long> implements IEquipmentDAO {}
