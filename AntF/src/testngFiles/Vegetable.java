package testngFiles;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Vegetable {
	public static final String USERNAME = "vishalchopra790";

	public static final String ACCESS_KEY = "0e1a2a50-517c-4e34-9e34-727253100792";

	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	       @Test
         public void Demo() throws InterruptedException, MalformedURLException{
	    	   DesiredCapabilities caps = DesiredCapabilities.firefox();
	    	   caps.setCapability("platform", "Windows 8.1");
	    	   caps.setCapability("version", "53.0");

	   		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.getTitle();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(3000);

		String[] itemsNeeded = { "Cucumber", "Orange", "Pears", "Onion" };
		WebDriverWait w = new WebDriverWait(driver, 5);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[class='promoInfo']")));
		System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
		driver.quit();
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			// System.out.println(products.get(i).getText());
			String[] name = products.get(i).getText().split("-");
			String formatName = name[0].trim();
			// covert array into array list
			// check whether the items present in array list could be selected

			List namesList = Arrays.asList(itemsNeeded);

			if (namesList.contains(formatName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == (itemsNeeded.length)) {
					break;
				}
			}

		}
	}
}
