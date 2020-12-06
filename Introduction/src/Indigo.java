import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.openqa.selenium.support.ui.Select;
public class Indigo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    //invoke .exe file
		System.setProperty("webdriver.chrome.driver","C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class='col-sm-5 col-5 padd-left pax-selection-container']/div/input")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='col-sm-5 col-5 padd-left pax-selection-container']/div/label")).getAttribute("value"));
			for(int i=1;i<5;i++)
		{
		driver.findElement(By.className("icon-plus")).click();
		}
		System.out.println(driver.findElement(By.xpath("//div[@class='col-sm-5 col-5 padd-left pax-selection-container']/div/input")).getAttribute("value"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		    js.executeScript("window.scrollBy(0,200)");
		    
		driver.findElement(By.xpath("//div[@class='passenger-done-blck']//button")).click();
		
		driver.close();

 }
}