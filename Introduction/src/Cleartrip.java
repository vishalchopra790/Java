import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// invoke .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		// driver.switchTo().alert().dismiss();
		System.out.println(driver.getTitle());
		// System.out.println(driver.findElement(By.id("RoundTrip")).isDisplayed());

		// System.out.println(driver.findElement(By.id("RoundTrip")).isEnabled());

		// System.out.println(driver.findElement(By.id("RoundTrip")).isSelected());

		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("OneWay")).click();

		// System.out.println(driver.findElement(By.id("RoundTrip")).isSelected());

		WebElement dest = driver.findElement(By.id("FromTag"));

		dest.clear();

		dest.sendKeys("del");

		Thread.sleep(4000);

		// dest.sendKeys(Keys.DOWN);

		dest.sendKeys(Keys.ENTER);

		WebElement to = driver.findElement(By.id("ToTag"));

		to.clear();

		to.sendKeys("washington");

		for (int i = 0; i < 3; i++) {

			Thread.sleep(2000);

			to.sendKeys(Keys.DOWN);

		}

		Thread.sleep(2000);

		to.sendKeys(Keys.ENTER);
		driver.findElement(By.id("DepartDate")).click();
////////calendar

		while (!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().contains("July")) {

			driver.findElement(By.cssSelector("a.nextMonth ")).click();

		}
		List<WebElement> dates = driver.findElements(By.cssSelector("a.ui-state-default "));
		int count = dates.size();
		for (int i = 0; i < count; i++) {
			String date = dates.get(i).getText();
			System.out.println(date.equalsIgnoreCase("2"));
			if (date.equalsIgnoreCase("2")) {

				dates.get(i).click();
				break;
			}
		}

		// driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(1000);

		// Passengers adult count
		driver.findElement(By.name("adults")).click();
		Select a = new Select(driver.findElement(By.name("adults")));
		a.selectByIndex(3);
		driver.findElement(By.name("adults")).click();
		System.out.println(driver.findElement(By.name("adults")).getAttribute("value") + "Adults");

		// Passenger child count
		driver.findElement(By.xpath("//*[@name='childs']")).click();
		Select c = new Select(driver.findElement(By.xpath("//*[@name='childs']")));
		c.selectByValue("2");
		driver.findElement(By.xpath("//*[@name='childs']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@name='childs']")).getAttribute("value") + "Childrens");

		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("Indigo");
		// Search button
		driver.findElement(By.id("SearchBtn")).click();
		
		/*Set<String> ids=driver.getWindowHandles();
		  Iterator<String> it=  ids.iterator();
		  String parentid=it.next();
		  String childid=it.next();
		  driver.switchTo().window(childid); */
		Thread.sleep(15000);
		//driver.findElement(By.xpath("//span[text()='Support']")).click();
		//WebElement button=driver.findElement(By.xpath("//div[@class='col-19']//div[2]//div[1]//div[1]//div[2]//div[4]//button[1]"));
		//button.click();
		driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[2]//div[4]//button[1]")).click();
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='row']//div[1]//div[1]//div[2]//div[4]//button[1]"));
		for (int i=1;i<li.size();i++) {
			System.out.println(li.get(i).getText());
		}
		
		//driver.findElement(By.xpath("(//button[@class='booking'])[2]")).click();
		
		  //System.out.println(driver.getTitle());
		//System.out.println(driver.getTitle());
		//Actions b=new Actions(driver);
		//b.moveToElement(driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[2]//div[4]//button[1]"))).click().build().perform();
        
		
		/*Set<String> ids=driver.getWindowHandles();
		  Iterator<String> it=  ids.iterator();
		  String parentid=it.next();
		  String childid=it.next();
		  driver.switchTo().window(childid);
		  System.out.println(driver.getTitle());  */
		  
		// Print error
		// System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		Thread.sleep(3000);
		// driver.close();

	}
}