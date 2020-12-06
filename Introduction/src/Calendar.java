import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManagerException;

public class Calendar {
    @Test
	public static void method() throws InterruptedException {
		// TODO Auto-generated method stub
		// invoke .exe file
         WebDriver driver;
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("DepartDate")).click();

		while (!driver.findElement(By.cssSelector("div.title span.ui-datepicker-month")).getText().contains("June")) {
			driver.findElement(By.cssSelector("div.header a.nextMonth")).click();
		}

		List<WebElement> dates = driver.findElements(By.cssSelector("table.calendar a.ui-state-default "));
		int count = dates.size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector("table.calendar a.ui-state-default ")).get(i).getText();
			System.out.println(text.equalsIgnoreCase("2"));
			if (text.equalsIgnoreCase("2")) {
				driver.findElements(By.cssSelector("table.calendar a.ui-state-default ")).get(i).click();
				break;
			}

		}
		System.out.println(driver.findElement(By.id("DepartDate")).getAttribute("value"));
	}

}
