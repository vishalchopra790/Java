import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("#username")).sendKeys("vishal@gamai.com");
		driver.findElement(By.name("pw")).sendKeys("vishal@gamai.com");
		driver.findElement(By.id("Login")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

	
	}
}
