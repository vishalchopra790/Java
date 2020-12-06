import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("vishal");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[id='div_login_error']")).getText());
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(5000);
	    driver.close();
	    System.out.println("Test Case Pass");

	
	}
}