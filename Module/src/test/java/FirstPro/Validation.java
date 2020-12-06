package FirstPro;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.ValidationHomepage;
import resources.Base;

public class Validation extends Base {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(HomeSignUp.class.getName());
	@BeforeTest
	public void start() throws IOException {
		 driver=intDrivers();
		 log.info("Driver Intialized");
		 driver.manage().deleteAllCookies();
		 log.info("Cookies Deleted");
		 driver.get(prop.getProperty("URL"));
	}
	@Test
	public void val() {
		ValidationHomepage vh=new ValidationHomepage(driver);
		Assert.assertFalse(vh.getNavBar().isDisplayed());
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
