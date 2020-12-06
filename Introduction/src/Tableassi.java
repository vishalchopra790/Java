import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableassi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size()+ " No of  rows");
		System.out.println(driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size()+ " No of columns");
		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText()+ " required data");
		
		
		
		
	}
}