package Academy;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import pageObject.LandingPage;

import pageObject.loginPF;

import resources.Drivers;

public class ValidationNavigationHeader extends Drivers {
	public WebDriver driver;

	public static Logger log = LogManager.getLogger(ValidationNavigationHeader.class.getName());

	@BeforeTest

	
	public void before() throws IOException {

		driver = drivers();

		log.info("Invoked Successfully");

		driver.get("https://rahulshettyacademy.com");

		log.info("Navigate to Homepage");

		System.out.println("Test execution started");

	}

	@Test

	public void stringMatch() throws IOException {

		LandingPage p = new LandingPage(driver);

		
			Assert.assertEquals(p.getTitle().getText(), "Featured Courses");

			// Assert.assertTrue(true);
			log.info("Title not matched");



		//AssertJUnit.assertTrue(p.getNavigation().isDisplayed());

	}

	@AfterTest

	public void after() {

		driver.close();

		System.out.println("Test Execution Stopped");

	}

}