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
 * Methode de test pour la partie statistique
 * dans l'interface administrateuer
 * @author RAKOTOBE Sitraka Eric
 */
public class IntegrationTestReporting {

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
	public void testGraphicReportingArePresents() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("adminLink")).click();
		driver.findElement(By.linkText("Reporting")).click();

		assertTrue(isElementPresent(By.id("statisticsBookingGraphicsArticle")));
		assertTrue(isElementPresent(By.id("statisticsTurnOverGraphicsArticle")));
		assertTrue(isElementPresent(By.id("statisticsMarginGraphicsArticle")));
		assertTrue(isElementPresent(By.id("statisticsRateOccupancyGraphicsArticle")));
		assertTrue(isElementPresent(By.id("statisticsFlatTypeBookedGraphicsArticle")));
		assertTrue(isElementPresent(By.id("statisticsEquipmentTypeGraphicsArticle")));
		assertTrue(isElementPresent(By.id("statisticsPassGraphicsArticle")));
		assertTrue(isElementPresent(By.id("statisticRatingServiceGraphicsArticle")));
		assertTrue(isElementPresent(By.id("statisticNumberOfCustomersGraphicsArticle")));
		assertTrue(isElementPresent(By.id("statisticBreakDownGraphicsArticle")));
	}
}
