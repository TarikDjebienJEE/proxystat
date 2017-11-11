package com.dreamit.proxystat.integration;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Contains all integration test related to customer pages : booking, history, account creation
 * @author acraske
 *
 */
public class IntegrationTestCustomer {

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
	
	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	@Test
	public void testCustomerCanAccessBookingHistoryAndCancelOneOrder() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("tarik");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("123456");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("customerLink")).click();
		driver.findElement(By.linkText("Booking history")).click();
		driver.findElement(By.id("bookingCancel")).click();

		assertTrue(isElementPresent(By.id("messageOk")));
	}
	
}
