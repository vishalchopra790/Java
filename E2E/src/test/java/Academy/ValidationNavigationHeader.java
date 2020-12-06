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

  LandingPage p;
	

	public static Logger log = LogManager.getLogger(ValidationNavigationHeader.class.getName());

	@BeforeTest

	
	
	
	public void before() throws IOException {

		driver = Intdrivers();

		log.info("Invoked Successfully");

		driver.get(prop.getProperty("url"));

		log.info("Navigate to Homepage");

		System.out.println("Test execution started");
	

	}

	@Test

	public void stringMatch() throws IOException {

		 p = new LandingPage(driver);		
			Assert.assertEquals(p.getTitle().getText(), "Featured Courses");
			log.info("Title matched");

	}
	@Test
	public void Nav() {
		Assert.assertEquals(p.getNavigation().getText(), "Our Students", "String Matched");
		log.info("Matched");
	}
	

  
	@Test
	public void Header() throws IOException{
		
		 p = new LandingPage(driver);
	Assert.assertEquals(p.getHeader().getText(), "The academy is l by Rahul Shetty, a Test evangelist and Test architect with over 10+ years in the IT industry.");
	System.out.println(p.getHeader().getText());
	}
	@AfterTest

	public void after() {

		driver.quit();

		System.out.println("Test Execution Stopped");

	}

}