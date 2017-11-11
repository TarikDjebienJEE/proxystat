package com.dreamit.proxystat.integration;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Tests d'integration pour la partie
 * rating globale 
 * @author RAKOTOBE Sitraka Eric
 *
 */
public class IntegrationTestRating {


	private WebDriver driver;
	private final String baseUrl = "http://localhost:8080";


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testCanDisplayFiveFirstsRatings() throws Exception {
		driver.get(baseUrl + "/proxystat/");

		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("tarik");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("123456");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkRating")).click();

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*#deblues:[\\s\\S]*$"));
	}

	@Test
	public void testCanSubmitRatingWithMessage() throws Exception {
		driver.get(baseUrl + "/proxystat/");
		String comment = "my new comment";
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("tarik");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("123456");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkRating")).click();
		driver.findElement(By.id("comments")).clear();
		driver.findElement(By.id("comments")).sendKeys(comment);
		driver.findElement(By.id("submitButtonRating")).click();
		
		//assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*#tarikcustomer: " + comment + "[\\s\\S]*$"));
	}	

}