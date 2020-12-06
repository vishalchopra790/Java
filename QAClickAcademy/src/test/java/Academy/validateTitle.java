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
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import Resources.base;

public class validateTitle extends base{
	public WebDriver driver;
	 public static Logger log =LogManager.getLogger(base.class.getName());	 
		@BeforeTest
		public void initialize() throws IOException
		{	
			driver=IntializeDriver();
			 log.info("Driver is initialized");			
			 driver.get(prop.getProperty("URL"));
			 log.info("Navigated to Home page");
		}
		@Test	
		public void validateAppTitle() throws IOException
		{		
			//one is inheritance
			// creating object to that class and invoke methods of it
			LandingPage l=new LandingPage(driver);
			//compare the text from the browser with actual text.- Error..
			Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSE");
			 log.info("Successfully validated Text message");
			 System.out.println("Test completed");		 		
			}
		@AfterTest
		public void teardown()
		{		
			driver.close();
			driver=null;		
		}	
}
