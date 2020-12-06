package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
 public WebDriver driver;
  By signin=By.xpath("//a[contains(text(),'Login')]");
  By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
  By navigation=By.xpath("//div[@class='nav-outer clearfix']//a[text()='Contact']");
  
  
 
  public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
}
  

public loginPF signin() {
		driver.findElement(signin).click();
		loginPF l = new loginPF(driver);
		return l;
	 }
public WebElement getNavigation() {
	return driver.findElement(navigation);
 }
public WebElement getTitle() {
	return driver.findElement(title);
 }
}
 