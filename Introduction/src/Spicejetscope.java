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

public class Spicejetscope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// invoke .exe file

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\X133477\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.cssSelector("div[class='wrapper_footer']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement sub = footer.findElement(By.xpath("//div[@class='footer_left']/span/table/tbody/tr[2]"));
		System.out.println(sub.findElements(By.tagName("a")).size());
		//WebElement copy=sub.findElement(By.xpath("//div[@class='footer-copyright-text']/div/ul"));
		//System.out.println(sub.findElements(By.tagName("a")).size());
		Thread.sleep(3000);

		for (int i = 0; i < sub.findElements(By.tagName("a")).size(); i++) {
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			sub.findElements(By.tagName("a")).get(i).sendKeys(click);
			Thread.sleep(5000);
			System.out.println(i);

		}
		Set<String> avc = driver.getWindowHandles();
		Iterator<String> it = avc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
