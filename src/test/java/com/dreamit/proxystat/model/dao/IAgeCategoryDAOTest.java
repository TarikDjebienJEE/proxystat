package com.dreamit.proxystat.model.dao;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dreamit.proxystat.model.entities.AgeCategory;

/**
 * Classe de test pour les DAO AgeCategory
 * @author RAKOTOBE Sitraka Eric
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public class IAgeCategoryDAOTest extends AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private IAgeCategoryDAO ageCategoryDao;
	
	
	
	@Test
	public void testLoadGuestAgeBreakDownResultIsGreaterThanOne() {
		Map<AgeCategory, Integer> result = ageCategoryDao.loadGuestAgeBreakDown();
		
		assert(result.size() > 0);
	}
	
	
}