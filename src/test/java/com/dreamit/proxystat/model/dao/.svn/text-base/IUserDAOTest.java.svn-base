package com.dreamit.proxystat.model.dao;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.dreamit.proxystat.model.dao.IUserDAO;
import com.dreamit.proxystat.model.dao.pattern.GenericDataAccessObject;
import com.dreamit.proxystat.model.entities.User;

/**
 * Classe de test pour le dao user
 * @author RAKOTOBE Sitraka Eric
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-context.xml"})
public class IUserDAOTest extends GenericJpaDataAccessObjectTest<User, Long>{

	@Autowired 
	private IUserDAO userDao;

	private User user ; 
	
	/**
	 * Constructeur de la classe
	 */
	public IUserDAOTest() {
		super();
		user = new User();
		user.setId(new Long(200));
		user.setEnabled(true);
		user.setLogin("usernametestjunit");
		user.setPassword("passwordtestjunit");
	}	


	@Override
	/** {@inheritDoc}**/
	protected GenericDataAccessObject<?, ?> getDAO() {
		return userDao;
	}


	@Override
	/** {@inheritDoc}**/
	protected User getEntity() {
		return user ;
	}


	@Override
	/** {@inheritDoc}**/
	protected Long getPK() {
		return user.getId();
	} 
	
	@Test
	public void canFindUserByLoginUsingFindByExample() {
		String login = "tarik";
		User user = new User();
		user.setLogin(login);
		user.setEnabled(true);
		List<User> result;
		int expectedSize = 1;		
		
		result = userDao.findByExample(user);
		
		assertEquals(expectedSize, result.size());
	}

}
