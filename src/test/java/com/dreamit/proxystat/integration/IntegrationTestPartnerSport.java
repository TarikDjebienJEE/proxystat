package com.dreamit.proxystat.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Contains all integration test related to sport patner
 * @author acraske
 *
 */
public class IntegrationTestPartnerSport {

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
	public void testSportPartnerCanAccessToSportAdminPage() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();

		assertTrue(isElementPresent(By.id("sportAdmin")));
	}
	
	@Test
	public void testCustomerCannotAccessToSportAdminPage() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("customer");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("customer");
		driver.findElement(By.id("login_button")).click();

		assertFalse(isElementPresent(By.id("sportAdmin")));
	}
	
	@Test
	public void testMechanicPartnerCannotAccessToSportAdminPage() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_pass1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();

		assertFalse(isElementPresent(By.id("sportAdmin")));
	}
	
	@Test
	public void testSportPartnerCanListEquipementCategory() throws InterruptedException {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCategories")).click();
		
		assertTrue(isElementPresent(By.id("dataTables")));
		assertTrue(isElementPresent(By.id("name")));
	}
	
	@Test
	public void testSportPartnerCanAddEquipementCategory() throws InterruptedException {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCategories")).click();
		driver.findElement(By.id("createCategory")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("sport integr");
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("sport integration test");
		driver.findElement(By.id("createCategory")).click();

		assertTrue(isElementPresent(By.id("messageOk")));
	}

	@Test
	public void testSportPartnerCannotAddEquipementCategoryWithoutName() throws InterruptedException {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCategories")).click();
		driver.findElement(By.id("createCategory")).click();
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("sport integration test");
		driver.findElement(By.id("createCategory")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));
	}
	
	@Test
	public void testSportPartnerCannotAddEquipementCategoryWithoutDescription() throws InterruptedException {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCategories")).click();
		driver.findElement(By.id("createCategory")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("sport integr");
		driver.findElement(By.id("createCategory")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));
	}
	
	@Test
	public void testSportPartnerCanUpdateEquipementCategory() throws InterruptedException {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCategories")).click();
		driver.findElement(By.xpath("(//input[@id='desc'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@id='desc'])[3]")).sendKeys("sport integration test2");
		driver.findElement(By.xpath("(//input[@id='categoryUpdate'])[3]")).click();
		
		assertEquals("sport integration test2", driver.findElement(By.xpath("(//input[@id='desc'])[3]")).getAttribute("value"));
	}
	
	@Test
	public void testSportPartnerCanDeleteEquipementCategory() throws InterruptedException {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkCategories")).click();
		driver.findElement(By.xpath("(//input[@id='categoryDelete'])[3]")).click();
		
		assertTrue(isElementPresent(By.id("messageOk")));
	}
	
	@Test
	public void testSportPartnerCanListEquipement() throws InterruptedException {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkOffer")).click();
		
		assertTrue(isElementPresent(By.id("equipmentDataTable")));
		assertTrue(isElementPresent(By.id("name")));
	}
	
	@Test
	public void testSportPartnerCanAddEquipement() throws InterruptedException {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkOffer")).click();
		driver.findElement(By.id("createEquipment")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("sport integr");
		driver.findElement(By.id("desc")).clear();
		driver.findElement(By.id("desc")).sendKeys("sport integration test");
		driver.findElement(By.id("minHeight")).clear();
		driver.findElement(By.id("minHeight")).sendKeys("0");
		driver.findElement(By.id("quality")).clear();
		driver.findElement(By.id("quality")).sendKeys("standard");
		driver.findElement(By.id("size")).clear();
		driver.findElement(By.id("size")).sendKeys("0");
		driver.findElement(By.id("stock")).clear();
		driver.findElement(By.id("stock")).sendKeys("0");
		driver.findElement(By.id("createEquipment")).click();
		
		assertTrue(isElementPresent(By.id("messageOk")));
	}

	@Test
	public void testSportPartnerCannotAddEquipementWithoutName() throws InterruptedException {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkOffer")).click();
		driver.findElement(By.id("createEquipment")).click();
		driver.findElement(By.id("desc")).clear();
		driver.findElement(By.id("desc")).sendKeys("a");
		driver.findElement(By.id("createEquipment")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));
	}
	
	@Test
	public void testSportPartnerCannotAddEquipementWithoutDescription() throws InterruptedException {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkOffer")).click();
		driver.findElement(By.id("createEquipment")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("a");
		driver.findElement(By.id("createEquipment")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));
	}
	
	@Test
	public void testSportPartnerCannotUpdateEquipementWithoutName() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkOffer")).click();
		driver.findElement(By.xpath("(//input[@id='name'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@id='name'])[4]")).sendKeys("");
		driver.findElement(By.xpath("(//input[@id='offerUpdate'])[4]")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));
	}
	
	@Test
	public void testSportPartnerCannotUpdateEquipementWithoutDescription() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkOffer")).click();
		driver.findElement(By.xpath("(//input[@id='desc'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@id='desc'])[4]")).sendKeys("");
		driver.findElement(By.xpath("(//input[@id='offerUpdate'])[4]")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));
	}
	
	@Test
	public void testSportPartnerCanUpdateEquipement() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkOffer")).click();
		driver.findElement(By.xpath("(//input[@id='desc'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@id='desc'])[4]")).sendKeys("sport integration test2");
		driver.findElement(By.xpath("(//input[@id='offerUpdate'])[4]")).click();
		
		assertTrue(isElementPresent(By.id("messageOk")));
	}
	
	@Test
	public void testSportPartnerCannotDeleteEquipementDueToFK() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkOffer")).click();
		driver.findElement(By.xpath("(//input[@id='offerDelete'])[4]")).click();
		
		assertTrue(isElementPresent(By.id("messageKo")));
	}
	
	@Test
	public void testSportPartnerGetEquipmentListing() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkListing")).click();

		assertTrue(isElementPresent(By.id("dataTables")));
		assertTrue(isElementPresent(By.xpath("//table[@id='dataTables']/tbody/tr/td")));
	}
	
	@Test
	public void testSportPartnerGetFullEquipmentListing() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkListing")).click();
		driver.findElement(By.id("showAll")).click();
		
		assertTrue(isElementPresent(By.id("dataTables")));
		assertTrue(isElementPresent(By.xpath("//table[@id='dataTables']/tbody/tr[3]/td")));
	}
	
	@Test
	public void testReturnPageDisplayBookingStandardInformation() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkReturn")).click();
		
		assertTrue(isElementPresent(By.xpath("//table[@id='dataTables']/tbody/tr[3]/td")));
		assertTrue(isElementPresent(By.xpath("//table[@id='dataTables']/tbody/tr[3]/td[2]")));
		assertTrue(isElementPresent(By.xpath("//table[@id='dataTables']/tbody/tr[3]/td[4]")));
		assertTrue(isElementPresent(By.xpath("//table[@id='dataTables']/tbody/tr[3]/td[5]")));
	}
	
	@Test
	public void testCanReturnGuestEquipmentForOneBooking() {
		driver.get(baseUrl + "/proxystat/");
		
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("admin_sport1");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("admin");
		driver.findElement(By.id("login_button")).click();
		driver.findElement(By.id("linkReturn")).click();
		driver.findElement(By.xpath("(//input[@id='bookingReturn'])[7]")).click();
		driver.findElement(By.id("returnDate")).clear();
		driver.findElement(By.id("returnDate")).sendKeys("03/20/2013");
		new Select(driver.findElement(By.id("returnStateAccepted"))).selectByVisibleText("true");
		driver.findElement(By.id("returnComments")).clear();
		driver.findElement(By.id("returnComments")).sendKeys("test");
		driver.findElement(By.id("update")).click();

		assertTrue(isElementPresent(By.id("messageOk")));
	}
	
}
