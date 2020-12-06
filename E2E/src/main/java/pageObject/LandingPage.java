package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
 public WebDriver driver;
  By signin=By.xpath("//a[contains(text(),'Login')]");
  By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
  By navigation=By.cssSelector("div[class*='light'] h2");
  By header=By.xpath("//ul[@class='list-style-two']//li[text()='The academy is led by Rahul Shetty, a Test evangelist and Test architect with over 10+ years in the IT industry.']");
  
 
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
public WebElement getHeader() {
	return driver.findElement(header);
}
}
 