package com.dreamit.proxystat.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.dreamit.proxystat.model.dao.IRoleDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Role;

/**
 * Implementation IRoleDAO
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class RoleDAOImpl extends GenericJpaDataAccessObject<Role, Long> implements IRoleDAO {}
