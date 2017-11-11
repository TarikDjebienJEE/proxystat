package com.dreamit.proxystat.integration;

import static org.junit.Assert.*;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * Contains all integration test related to admin research customer and her bookings
 * @author rudy stienne
 *
 */
public class IntegrationTestAdminResearchCustomer {

	private  WebDriver driver;
	private final String baseUrl = "http://localhost:8080";

	@Before
	public void setUp() {
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
	public void testAdminCanAccessToResearchCustomerAdminPage() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCustomersBooking")).click();
		
		assertTrue(isElementPresent(By.id("sectionResearchCustomer")));
	}
	
	@Test
	public void testMechanicPartnerCannotAccessToResearchCustomerAdminPage() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		
		assertFalse(isElementPresent(By.id("linkCustomersBooking")));
	}
	

	@Test
	public void testSportPartnerCannotAccessAdminPage() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		
		assertFalse(isElementPresent(By.id("linkCustomersBooking")));
	}


	@Test
	public void testAdminResearchCustomer(){
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCustomersBooking")).click();
		driver.findElement(By.id("customername")).clear();
		driver.findElement(By.id("customername")).sendKeys("john");
		driver.findElement(By.id("customersurname")).clear();
		driver.findElement(By.id("customersurname")).sendKeys("doe");
		driver.findElement(By.id("researchCustomer_button")).click();
		
		assertFalse(isElementPresent(By.id("messageKo")));	
	}
	
	
	@Test
	public void testAdminResearchCustomerWithOutName(){
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCustomersBooking")).click();
		driver.findElement(By.id("customername")).clear();
		driver.findElement(By.id("customername")).sendKeys("");
		driver.findElement(By.id("customersurname")).clear();
		driver.findElement(By.id("customersurname")).sendKeys("doe");
		driver.findElement(By.id("researchCustomer_button")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));	
	}
	
	@Test
	public void testAdminResearchCustomerWithOutSurName(){
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCustomersBooking")).click();
		driver.findElement(By.id("customername")).clear();
		driver.findElement(By.id("customername")).sendKeys("john");
		driver.findElement(By.id("customersurname")).clear();
		driver.findElement(By.id("customersurname")).sendKeys("");
		driver.findElement(By.id("researchCustomer_button")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));	
	}
	
	@Test
	public void testAdminResearchCustomerWithOutNameAndSurname(){
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCustomersBooking")).click();
		driver.findElement(By.id("researchCustomer_button")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));	
	}
	
	@Test
	public void testAdminViewCustomersInfo(){
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCustomersBooking")).click();
		driver.findElement(By.id("customername")).clear();
		driver.findElement(By.id("customername")).sendKeys("john");
		driver.findElement(By.id("customersurname")).clear();
		driver.findElement(By.id("customersurname")).sendKeys("doe");
		driver.findElement(By.id("researchCustomer_button")).click();
		driver.findElement(By.xpath("(//input[@id='researchInfosThisCustomer_button'])[1]")).click();
		
		assertTrue(isElementPresent(By.id("researchBookingThisCustomer_button")));	
	}
	
	@Test
	public void testAdminGetBookingListingByCustomer(){
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCustomersBooking")).click();
		driver.findElement(By.id("customername")).clear();
		driver.findElement(By.id("customername")).sendKeys("john");
		driver.findElement(By.id("customersurname")).clear();
		driver.findElement(By.id("customersurname")).sendKeys("doe");
		driver.findElement(By.id("researchCustomer_button")).click();
		driver.findElement(By.xpath("(//input[@id='researchInfosThisCustomer_button'])[1]")).click();
		driver.findElement(By.id("researchBookingThisCustomer_button")).click();
		
		assertFalse(isElementPresent(By.id("messageKo")));
	}
	

	@Test
	public void testAdminGetBookingListingByCustomerWithoutBooking() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCustomersBooking")).click();
		driver.findElement(By.id("customername")).clear();
		driver.findElement(By.id("customername")).sendKeys("agathe");
		driver.findElement(By.id("customersurname")).clear();
		driver.findElement(By.id("customersurname")).sendKeys("deblues");
		driver.findElement(By.id("researchCustomer_button")).click();
		driver.findElement(By.xpath("(//input[@id='researchInfosThisCustomer_button'])[1]")).click();
		driver.findElement(By.id("researchBookingThisCustomer_button")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));
	}
	
	
}
