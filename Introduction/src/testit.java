

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testit {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\XL_Apps\\\\eclipse\\\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("http://www.qaclickacademy.com/interview.php");
driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
//

}
}