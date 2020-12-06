import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flyauto {

	public static void main(String[] args) throws InterruptedException {

		String a = "Cape Verde";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\X133477\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#autocomplete")).click();
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("de");
		// driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000L);
		// driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ARROW_DOWN);
		// System.out.println(driver.findElement(By.cssSelector("#autocomplete")).getAttribute("value"));
		// driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String value = "return document.getElementById(\"autocomplete\").value;";
		String val1 = (String) js.executeScript(value);
		System.out.println(val1);
		int i = 0;
		while (!val1.equalsIgnoreCase("Cape Verde")) {
			i++;
			driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ARROW_DOWN);
			val1 = (String) js.executeScript(value);
			System.out.println(val1);
			if (i > 10) {
				break;
			}

		}
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ENTER);
	}
}