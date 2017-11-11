package com.dreamit.proxystat.integration;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Contains all integration test related to homepage : flag, homepage, contact
 * @author acraske
 *
 */
public class IntegrationTestHomepage {

	private  WebDriver driver;
	private final String baseUrl = "http://localhost:8080";
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	/**
	 * Pouvoir se connecter avec identifiants valide
	 * @author tarik DJEBIEN
	 */
	@Test
	public void testCanConnectWithCorrectCredentials() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("tarik");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("123456");
		driver.findElement(By.id("login_button")).click();
		
		try {
			assertTrue(isElementPresent(By.id("loginValidMessage")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	/**
	 * Pas de connexion avec identifiants invalide
	 * @author tarik DJEBIEN
	 */
	@Test
	public void testCannotConnectWithBadCredentials() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("tarik");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("1234567");
		driver.findElement(By.id("login_button")).click();
		
		try {
			assertTrue(isElementPresent(By.id("loginInvalidMessage")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

}
