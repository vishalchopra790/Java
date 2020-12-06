import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autusuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com"); 
		//url of the website
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
	    WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));
		
	    source.click();
	    source.sendKeys("BLR");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN); 
		source.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement dest=driver.findElement(By.xpath("//input[@placeholder='To']"));
		dest.click();
		dest.sendKeys("MAA");
		Thread.sleep(2000);
		dest.sendKeys(Keys.ARROW_DOWN); 
		dest.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//////JavascriptExecutor js = (JavascriptExecutor) driver;
	   // js.executeScript("window.scrollBy(0,200)");
	    
	    driver.close();
	}

}
