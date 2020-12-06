package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.base;

public class HomePage extends base{
	public WebDriver driver;
	@BeforeTest
	public void InvokeDriver() throws IOException
	{
		driver=IntializeDriver();	
		driver = new ChromeDriver();
	}		
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException
	{	
		driver.get(prop.getProperty("URL"));
		LandingPage l=new LandingPage(driver);
		l.getLogin().click(); //driver.findElement(By.css()
		LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);	
		lp.getLogin().click();		
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();	
	}	
    @DataProvider
    public Object[][] getData()
	{
			// Row stands for how many different data types test should run
			// column stands for how many values per each test
			// When you say that Array size is 2, index starts from 0,1. Not from 1.
	   Object[][] data = new Object[2][2];
			//0th row
	   data[0][0]="nonrestricteduser@gmail.com";
	   data[0][1]= "123456";
			//data[0][2]="Restricted User";
			//1st row
	   data[1][0]="restricteduser@gmail.com";
	   data[1][1]="45678";
			//data[1][2]="Non-restricted User";			
	   return data;
	}
}
