package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidationHomepage {
	public WebDriver driver;
  private By navBAr=By.cssSelector("nav[class*='navbar-dark']");
  
  
  public ValidationHomepage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	  this.driver=driver;
}




public WebElement getNavBar() {
	  return driver.findElement(navBAr);
  }
  
}
