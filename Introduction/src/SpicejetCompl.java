import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SpicejetCompl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// invoke .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\X133477\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com");
		
		System.out.println(driver.getTitle());
		Thread.sleep(5000);

		// Check the trip
		// System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
		//	System.out.println("Is Enabled");
		//	Assert.assertTrue(true);
		//} else {
		//	Assert.assertFalse(false);
		//}

		//Cpde for selectong origin and destination
		  driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();	   	   

	        driver.findElement(By.cssSelector("a[value='DEL']")).click();

	        System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value"));

		
		/*driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);*/


		// driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		System.out.println(
				driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value"));
		// Thread.sleep(3000);
		// Calendar

		while (!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().contains("July")) {

			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();

		}
		List<WebElement> dates = driver.findElements(By.cssSelector("a.ui-state-default "));
		int count = dates.size();
		for (int i = 0; i < count; i++) {
			String date = dates.get(i).getText();
			System.out.println(date.equalsIgnoreCase("2"));
			if (date.equalsIgnoreCase("20")) {

				dates.get(i).click();
				break;
			}
		}

		// driver.findElement(By.xpath("//a[@class='ui-state-default
		// ui-state-highlight']")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Is Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}

		// Code for no of passengers selected
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		// s.selectByValue("4");
		s.selectByVisibleText("5");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());

		// Code for selection of discount availed by user checkbox
		/*Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
*/
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Thread.sleep(2000);
	
			driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='continue-to-contact-page']")).click();
			/*WebDriverWait w=new WebDriverWait(driver,30);
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.button-continue-text")));
//			driver.findElement(By.cssSelector("span.button-continue-text")).click();
//			
//			Actions a=new Actions(driver);
//			a.moveToElement(driver.findElement(By.cssSelector("span.button-continue-text"))).click().build().perform();
	
			//driver.close(); */

	}

}
