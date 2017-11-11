package com.dreamit.proxystat.integration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Contains all integration test related to mechanic partner
 * @author rudy stienne
 *
 */
public class IntegrationTestPartnerMechanic {
	
	private  WebDriver driver;
	private WebDriverWait wait;
	private final String baseUrl = "http://localhost:8080";

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
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
	
	private void clickLinkAndWaitById(String id) {
		driver.findElement(By.id( id )).click();
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void clickLinkAndWaitByXpath(String xpath) {
		driver.findElement(By.xpath( xpath )).click();
		try {
			driver.wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// en commentaires car non teste pour l'instant
	
//	@Test
//	public void testMechanicPartnerCanAccessToPassAdminPage() {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartner")));
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//		
//		assertTrue(isElementPresent(By.id("mechanicAdmin")));
//	}
//	
//	@Test
//	public void testCustomerCannotAccessToPassAdminPage() {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("customer");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("customer");
//		driver.findElement(By.id("login_button")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartner")));
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//		
//		assertFalse(isElementPresent(By.id("mechanicAdmin")));
//	}
//	
//	@Test
//	public void testSportPartnerCannotAccessToPassAdminPage() {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartner")));
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//		
//		assertFalse(isElementPresent(By.id("mechanicAdmin")));
//	}
//	
//	@Test
//	public void testMechanicPartnerCanListTrack() throws InterruptedException {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartner")));
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//
//		assertTrue(isElementPresent(By.id("trackDataTable")));
//	}
//	
//	@Test
//	public void testMechanicPartnerCanListPass() throws InterruptedException {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartner")));
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//
//		assertTrue(isElementPresent(By.id("passDataTable")));
//	}
//	
//	@Test
//	public void testMechanicPartnerCanAddTrack() throws InterruptedException {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartnerToAddTrack")));
//		driver.findElement(By.id("linkAdminMechanicPartnerToAddTrack")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("trackname")));
//		driver.findElement(By.id("trackname")).clear();
//		driver.findElement(By.id("trackname")).sendKeys("track integration test");
//		driver.findElement(By.id("trackdomain")).clear();
//		driver.findElement(By.id("trackdomain")).sendKeys("track integration test");
//		driver.findElement(By.id("tracktype")).clear();
//		driver.findElement(By.id("tracktype")).sendKeys("track integration test");
//		driver.findElement(By.id("createTrack_button")).click();
//		
//		assertTrue(isElementPresent(By.id("messageOk")));
//	}
//	
//	@Test
//	public void testMechanicPartnerCannotAddAddTrackWithoutName() throws InterruptedException {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartnerToAddTrack")));
//		driver.findElement(By.id("linkAdminMechanicPartnerToAddTrack")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("trackdomain")));
//		driver.findElement(By.id("trackdomain")).clear();
//		driver.findElement(By.id("trackdomain")).sendKeys("track integration test");
//		driver.findElement(By.id("tracktype")).clear();
//		driver.findElement(By.id("tracktype")).sendKeys("track integration test");
//		driver.findElement(By.id("createTrack_button")).click();
//		
//		assertTrue(isElementPresent(By.id("messageKo")));
//	}
//	
//	@Test
//	public void testMechanicPartnerCannotAddAddTrackWithoutDomain() throws InterruptedException {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartner")));
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartnerToAddTrack")));
//		driver.findElement(By.id("linkAdminMechanicPartnerToAddTrack")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("trackname")));
//		driver.findElement(By.id("trackname")).clear();
//		driver.findElement(By.id("trackname")).sendKeys("track integration test");
//		driver.findElement(By.id("tracktype")).clear();
//		driver.findElement(By.id("tracktype")).sendKeys("track integration test");
//		driver.findElement(By.id("createTrack_button")).click();
//		
//		assertTrue(isElementPresent(By.id("messageKo")));
//	}
//	
//	@Test
//	public void testMechanicPartnerCannotAddAddTrackWithoutType() throws InterruptedException {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartner")));
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartnerToAddTrack")));
//		driver.findElement(By.id("linkAdminMechanicPartnerToAddTrack")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("trackname")));
//		driver.findElement(By.id("trackname")).clear();
//		driver.findElement(By.id("trackname")).sendKeys("track integration test");
//		driver.findElement(By.id("trackdomain")).clear();
//		driver.findElement(By.id("trackdomain")).sendKeys("track integration test");
//		driver.findElement(By.id("createTrack_button")).click();
//		
//		assertTrue(isElementPresent(By.id("messageKo")));
//	}
	
	// en commentaires car non teste pour l'instant
	
//	@Test
//	public void testMechnicPartnerCanUpdateTrack() throws InterruptedException {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartner")));
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("(//input[@id='trackChoiceToModify'])[1]")));
//		clickLinkAndWaitByXpath("(//input[@id='trackChoiceToModify'])[1]");
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("trackname")));
//		driver.findElement(By.id("trackname")).clear();
//		driver.findElement(By.id("trackname")).sendKeys("track integration testModify");
//		driver.findElement(By.id("trackdomain")).clear();
//		driver.findElement(By.id("trackdomain")).sendKeys("track integration testModify");
//		driver.findElement(By.id("tracktype")).clear();
//		driver.findElement(By.id("tracktype")).sendKeys("track integration testModify");
//		driver.findElement(By.id("modifyTrack_button")).click();
//		
//		assertTrue(isElementPresent(By.id("messageOk")));
//	}
//	
//	@Test
//	public void testMechanicPartnerCanAddPass() throws InterruptedException {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("linkAdminMechanicPartnerToAddPass")));
//		driver.findElement(By.id("linkAdminMechanicPartnerToAddPass")).click();
//		 new Select(driver.findElement(By.id("trackidChoice"))).selectByVisibleText("Ski nordique");
//		 new Select(driver.findElement(By.id("priceChoice"))).selectByVisibleText("400.0");
//		 new Select(driver.findElement(By.id("periodChoice"))).selectByVisibleText("Vacances fevrier S2");
//		 new Select(driver.findElement(By.id("durationChoice"))).selectByVisibleText("1 jour");
//		 new Select(driver.findElement(By.id("ageCategoryChoice"))).selectByVisibleText("adulte");
//		  driver.findElement(By.id("createPass_button")).click();
//		
//		assertTrue(isElementPresent(By.id("messageOk")));
//	}
//	
//	@Test
//	public void testMechanicPartnerCanUpdatePass() throws InterruptedException {
//		driver.get(baseUrl + "/proxystat/");
//		
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("admin");
//		driver.findElement(By.id("login_button")).click();
//		driver.findElement(By.id("linkAdminMechanicPartner")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("(//input[@id='passChoiceToModify'])[1]")));
//		clickLinkAndWaitByXpath("(//input[@id='passChoiceToModify'])[1]");
//		 new Select(driver.findElement(By.id("trackidChoice"))).selectByVisibleText("Ski nordique modifié");
//		 new Select(driver.findElement(By.id("priceChoice"))).selectByVisibleText("100.0");
//		 new Select(driver.findElement(By.id("periodChoice"))).selectByVisibleText("Vacances fevrier S3");
//		 new Select(driver.findElement(By.id("durationChoice"))).selectByVisibleText("1 jour");
//		 new Select(driver.findElement(By.id("ageCategoryChoice"))).selectByVisibleText("adulte");
//		  driver.findElement(By.id("createPass_button")).click();
//		
//		assertTrue(isElementPresent(By.id("messageOk")));
//	}
	
	// todo rudy : ajouter les tests quand les boutons supprimer seront fonctionnels
}
