package com.dreamit.proxystat.integration;

import org.junit.*;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegrationTestContact {

	private  WebDriver driver;
	private WebDriverWait wait;
	private final String baseUrl = "http://localhost:8080";
	private StringBuffer verificationErrors = new StringBuffer();

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

	@Test
	public void testCreateMessageWithCorrectFields() throws Exception {
		driver.get(baseUrl + "/proxystat/");
		driver.findElement(By.id("linkContact")).click();

		// instruction ajoutée car une fois sur deux sélénimum ne trouve pas l'input "contactsurname", temps de chargement de la page
		wait.until(ExpectedConditions.elementToBeClickable(By.id("contactsurname")));

		driver.findElement(By.id("contactsurname")).clear();
		driver.findElement(By.id("contactsurname")).sendKeys("rudy");
		driver.findElement(By.id("contactname")).clear();
		driver.findElement(By.id("contactname")).sendKeys("stienne");
		driver.findElement(By.id("mail")).clear();
		driver.findElement(By.id("mail")).sendKeys("com.miage.proxystat@gmail.com");
		driver.findElement(By.id("message")).clear();
		driver.findElement(By.id("message")).sendKeys("test");
		driver.findElement(By.id("contact_button")).click();



		try {
			assertTrue(isElementPresent(By.id("messageRetourOk")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@Test
	public void testCreateMessageWithFieldSurnameEmpty() throws Exception {
		driver.get(baseUrl + "/proxystat/");
		driver.findElement(By.id("linkContact")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("contactsurname")));

		driver.findElement(By.id("contactsurname")).clear();
		driver.findElement(By.id("contactsurname")).sendKeys("");
		driver.findElement(By.id("contactname")).clear();
		driver.findElement(By.id("contactname")).sendKeys("stienne");
		driver.findElement(By.id("mail")).clear();
		driver.findElement(By.id("mail")).sendKeys("com.miage.proxystat@gmail.com");
		driver.findElement(By.id("message")).clear();
		driver.findElement(By.id("message")).sendKeys("test");
		driver.findElement(By.id("contact_button")).click();



		try {
			assertTrue(isElementPresent(By.id("messageRetourKo")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@Test
	public void testCreateMessageWithFieldNameEmpty() throws Exception {
		driver.get(baseUrl + "/proxystat/");
		driver.findElement(By.id("linkContact")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("contactsurname")));

		driver.findElement(By.id("contactsurname")).clear();
		driver.findElement(By.id("contactsurname")).sendKeys("rudy");
		driver.findElement(By.id("contactname")).clear();
		driver.findElement(By.id("contactname")).sendKeys("");
		driver.findElement(By.id("mail")).clear();
		driver.findElement(By.id("mail")).sendKeys("com.miage.proxystat@gmail.com");
		driver.findElement(By.id("message")).clear();
		driver.findElement(By.id("message")).sendKeys("test");
		driver.findElement(By.id("contact_button")).click();



		try {
			assertTrue(isElementPresent(By.id("messageRetourKo")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@Test
	public void testCreateMessageWithFieldEmailEmpty() throws Exception {
		driver.get(baseUrl + "/proxystat/");
		driver.findElement(By.id("linkContact")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("contactsurname")));

		driver.findElement(By.id("contactsurname")).clear();
		driver.findElement(By.id("contactsurname")).sendKeys("rudy");
		driver.findElement(By.id("contactname")).clear();
		driver.findElement(By.id("contactname")).sendKeys("stienne");
		driver.findElement(By.id("mail")).clear();
		driver.findElement(By.id("mail")).sendKeys("");
		driver.findElement(By.id("message")).clear();
		driver.findElement(By.id("message")).sendKeys("test");
		driver.findElement(By.id("contact_button")).click();



		try {
			assertTrue(isElementPresent(By.id("messageRetourKo")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@Test
	public void testCreateMessageWithFieldEmailMalFormed() throws Exception {
		driver.get(baseUrl + "/proxystat/");
		driver.findElement(By.id("linkContact")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("contactsurname")));

		driver.findElement(By.id("contactsurname")).clear();
		driver.findElement(By.id("contactsurname")).sendKeys("rudy");
		driver.findElement(By.id("contactname")).clear();
		driver.findElement(By.id("contactname")).sendKeys("stienne");
		driver.findElement(By.id("mail")).clear();
		driver.findElement(By.id("mail")).sendKeys("com.miage.proxystatgmail.com");
		driver.findElement(By.id("message")).clear();
		driver.findElement(By.id("message")).sendKeys("test");
		driver.findElement(By.id("contact_button")).click();



		try {
			assertTrue(isElementPresent(By.id("messageRetourKo")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@Test
	public void testCreateMessageWithFieldMessageEmpty() throws Exception {
		driver.get(baseUrl + "/proxystat/");
		driver.findElement(By.id("linkContact")).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("contactsurname")));

		driver.findElement(By.id("contactsurname")).clear();
		driver.findElement(By.id("contactsurname")).sendKeys("rudy");
		driver.findElement(By.id("contactname")).clear();
		driver.findElement(By.id("contactname")).sendKeys("stienne");
		driver.findElement(By.id("mail")).clear();
		driver.findElement(By.id("mail")).sendKeys("com.miage.proxystat@gmail.com");
		driver.findElement(By.id("message")).clear();
		driver.findElement(By.id("message")).sendKeys("");

		driver.findElement(By.id("contact_button")).click();



		try {
			assertTrue(isElementPresent(By.id("messageRetourKo")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}


}
