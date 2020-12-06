import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.openqa.selenium.support.ui.Select;
public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //invoke .exe file
		System.setProperty("webdriver.chrome.driver","C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		//s.selectByValue("4");
		s.selectByVisibleText("5");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();		
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		//s.deselectAll();
		
		}
  
}
