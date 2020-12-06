import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceXpath {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\XL_Apps\\eclipse\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://login.salesforce.com");
			driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("vishal");
			driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("visham");
			driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		Thread.sleep(5000);
	    driver.close();

	
	}
}