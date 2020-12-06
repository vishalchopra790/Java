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
import pageObject.forget;
import pageObject.loginPF;
import resources.Drivers;

public class base extends Drivers {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void before() throws IOException {
		driver = drivers();
		driver.get("https://rahulshettyacademy.com");
		System.out.println("Test execution started");
	}

	@Test(dataProvider = "getData")
	public void basePage(String Username, String Password, String text) throws IOException {
		driver.get("https://rahulshettyacademy.com");

		LandingPage p = new LandingPage(driver);
		loginPF l=p.signin();
		l.getEmail().sendKeys(Username);
		l.getPassword().sendKeys(Password);
		System.out.println(text);
		l.getSubmit().click();
		try {
		forget fp=l.forget();
		fp.getEmail().sendKeys("visbjn");
		fp.submit().click();
	}catch(Exception E)
		{
		System.out.println("Not available");
		}
	}
	

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "vishalchopra790@gmail.com";
		data[0][1] = "Vishal@18";
		data[0][2] = "Valid User";

		data[1][0] = "vishalchopra@gmail.com";
		data[1][1] = "Vishal@18";
		data[1][2] = "In Valid User";
		return data;
	}
	@AfterTest
	public void after() {
		driver.close();
		System.out.println("Test Execution Stopped");
	}
	
}
