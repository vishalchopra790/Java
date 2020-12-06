import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// invoke .exe file

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\X133477\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElements(By.tagName("a")).size());// total links on the page
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// limit webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver = footerdriver.findElement(By.xpath("//td[1]//ul[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			String clickoEachLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickoEachLink);
			Thread.sleep(5000);

		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.findElements(By.tagName("a")).size());
		}

	}
}
