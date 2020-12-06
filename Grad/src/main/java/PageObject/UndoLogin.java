/**
 * 
 */
package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author X133477
 *
 */
public class UndoLogin {
	public WebDriver driver;
	@FindBy(xpath = "//*[@id=\'usrname\']")
	WebElement username;

	@FindBy(xpath = "//*[@id='psw']")
	WebElement password;
	
	@FindBy(xpath = "//*[@id='recaptcha-anchor']/div[1]")
	WebElement captchaClick;
	
	@FindBy(xpath = "//*[@id='loginForm']/div[4]/div/div/iframe")
	WebElement captchaFrame;
	
	@FindBy(css = "[type='submit']")
	WebElement loginClick;
    
	

	public UndoLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * @return the captchaClick
	 */
	public WebElement getCaptchaClick() {
		return captchaClick;
	}

	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}

	public WebElement getCaptchaFrame() {
		return captchaFrame;
	}

	public WebElement getLoginClick() {
		return loginClick;
	}
	

}
