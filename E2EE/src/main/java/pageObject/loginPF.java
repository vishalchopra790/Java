package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPF {

	public WebDriver driver;
	
	
	public loginPF( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="[id='user_email'")
	WebElement email;
	@FindBy(css="[type='password']")
	WebElement password;
	@FindBy(xpath="//a[@class='link-below-button']")
		WebElement forget;
	@FindBy(css="[type='submit']")
	WebElement submit;

  public forget forget() {
	   forget.click();
	   return new forget(driver);
	
	  
  }
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
}
