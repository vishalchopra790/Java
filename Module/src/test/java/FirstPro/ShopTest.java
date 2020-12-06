package FirstPro;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.Shop;
import resources.Base;

public class ShopTest extends Base {
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
	public void category1Test() {
    	Homepage p=new Homepage(driver);
    	p.getShop().click();
		Shop s=new Shop(driver);
		s.getCategory1().click();
		System.out.println(driver.findElements(By.xpath("//div[@class='card-body']")).size());
		
				
	}



public static void getPhone() {
	
}
}