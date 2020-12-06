package Academy;

import org.testng.annotations.Test;
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

public class validateNavigationBar extends base{
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{	
		driver=IntializeDriver();		
		driver.get(prop.getProperty("URL"));
	}	
		@Test	
		public void validateAppNavBar() throws IOException
		{
			//one is inheritance
			// creating object to that class and invoke methods of it
			LandingPage l=new LandingPage(driver);	
			//compare the text from the browser with actual text.- Error..
		    Assert.assertTrue(l.getNavigationBar().isDisplayed());
		    log.info("Navigation Bar is displayed");
			 System.out.println("Test completed");
		 //   Assert.assertFalse(false);		
			}	
		@AfterTest
		public void teardown()
		{		
			driver.close();
			driver=null;		
		}	
}
