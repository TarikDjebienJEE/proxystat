package com.dreamit.proxystat.model.dao.impl;
import org.springframework.stereotype.Repository;
import com.dreamit.proxystat.model.dao.IPaymentCreditDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericJpaDataAccessObject;
import com.dreamit.proxystat.model.entities.PaymentCredit;

/**
 * CRUD Implementation PaymentCredit
 * @author RAKOTOBE Sitraka Eric
 */
@Repository
public class PaymentCreditDAOImpl extends GenericJpaDataAccessObject<PaymentCredit, Long> implements IPaymentCreditDAO {}
