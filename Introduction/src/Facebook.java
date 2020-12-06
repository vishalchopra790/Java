import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;
public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    //invoke .exe file
		System.setProperty("webdriver.chrome.driver","C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='fromCity']")).click();

		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));

		Thread.sleep(1000);

		source.click();

		Thread.sleep(1000);

		source.sendKeys("mumbai");

		Thread.sleep(1000);

		source.sendKeys(Keys.ARROW_DOWN);

		source.sendKeys(Keys.ENTER);

		WebElement dest = driver.findElement(By.xpath("//input[@placeholder='To']"));

		Thread.sleep(1000);

		 dest.click();

		Thread.sleep(1000);

		 dest.sendKeys("DEL");

		Thread.sleep(1000);
            dest.sendKeys(Keys.ARROW_DOWN);	
	
		dest.sendKeys(Keys.ENTER);
}	
}