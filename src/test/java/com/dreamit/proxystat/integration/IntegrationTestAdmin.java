package com.dreamit.proxystat.integration;

import static org.junit.Assert.assertEquals;
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
 * Contains all integration test related to administration pages
 * @author acraske
 *
 */
public class IntegrationTestAdmin {

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
	public void testCanDeleteComments() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("adminLink")).click();
		driver.findElement(By.linkText("Comments")).click();
		driver.findElement(By.xpath("(//input[@id='ratingDelete'])[6]")).click();

		assertTrue(isElementPresent(By.id("messageOk")));
	}
	
	@Test
	public void testCanAddSeason() {
		driver.get(baseUrl + "/proxystat/");
		String input = "test ihm";
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkSeason")).click();
		driver.findElement(By.id("createSeason")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(input);
		driver.findElement(By.id("startDate")).clear();
		driver.findElement(By.id("startDate")).sendKeys("1900-01-01");
		driver.findElement(By.id("endDate")).clear();
		driver.findElement(By.id("endDate")).sendKeys("1900-06-30");
		driver.findElement(By.id("create")).click();
		
		assertEquals(input, driver.findElement(By.xpath("(//input[@id='name'])[2]")).getAttribute("value"));
	}
	
	@Test
	public void testCanUpdateOrDeleteSeason() {
		driver.get(baseUrl + "/proxystat/");

		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkSeason")).click();
		
		assertTrue(isElementPresent(By.id("seasonUpdate")));
		assertTrue(isElementPresent(By.id("seasonUpdate")));
	}
	
}
