package com.dreamit.proxystat.model.dao.impl;

import org.springframework.stereotype.Repository;

import com.dreamit.proxystat.model.dao.IUserDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.User;

/**
 * Implementation IUserDAO
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class UserDAOImpl extends GenericJpaDataAccessObject<User, Long> implements IUserDAO {}
