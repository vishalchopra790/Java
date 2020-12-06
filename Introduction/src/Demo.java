import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //invoke .exe file
		System.setProperty("webdriver.chrome.driver","C:\\Users\\X133477\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("wifi");
		driver.findElement(By.cssSelector("input[name='btnK']")).click();
		//System.out.println(driver.getPageSource()); getting page  souce
		driver.get("https://www.yahoo.com");
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.close();
	}
  
}
