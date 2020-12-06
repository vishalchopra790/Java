package FirstPro;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.ValidationHomepage;
import resources.Base;




public class HomeSignUp extends Base{
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
	@Test(dataProvider="getData")
	public void sign(String name ,String email,String password,String DOB) throws IOException, InterruptedException {
		driver.get(prop.getProperty("URL"));
	  Homepage hp =new Homepage(driver); 
	  hp.getName().sendKeys(name);
	  hp.getEmail().sendKeys(email);	
	  hp.getPassword().sendKeys(password);
	  hp.getCheckBox().click();
	Select s=new Select(hp.getGender());
	s.selectByIndex(1);
	System.out.println(hp.getGender().getAttribute("value"));
	
	//Assert.assertFalse(hp.getOption3().isEnabled());
	//System.out.println(hp.getOption3().isDisplayed());
	hp.getOption3().click();
	hp.getDob().sendKeys(DOB);
	hp.getSubmit().click();
	System.out.println(hp.getSuccess().getText());
	Assert.assertEquals(hp.getSuccess().getText(),"Success!");
	log.debug("Sucessfully Sign up");
	hp.getShop().click();
	
	

}
	

@AfterTest
public void teardown() {
	//driver.quit();
}

@DataProvider
public Object[][] getData() {
	Object[][] data=new Object[2][4];
	data[0][0]="Vishal";
	data[0][1]="Vishalchopra@gmail.com";
	data[0][2]="Vishal";
	data[0][3]="07/08/1997";
	
	data[1][0]="Sahil";
	data[1][1]="sahillchopra@gmail.com";
	data[1][2]="890hjk";
	data[1][3]="11/11/1997";
	return data;
}
}