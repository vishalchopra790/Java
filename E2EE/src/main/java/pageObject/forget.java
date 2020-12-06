package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forget {

	public WebDriver driver;
	
	
	public forget( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="[id='user_email'")
	WebElement email;
	@FindBy(css="[type='submit']")
	WebElement instructions;
	

 
	public WebElement getEmail() {
		return email;
	}
	public WebElement submit() {
		return instructions;
	}
	
}
