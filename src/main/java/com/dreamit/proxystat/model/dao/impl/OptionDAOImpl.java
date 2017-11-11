package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IOptionDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.Option;

/**
 * CRUD Implementation Option
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class OptionDAOImpl extends GenericJpaDataAccessObject<Option, Long> implements IOptionDAO {}
