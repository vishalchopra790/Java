package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UndoPayment {

	public WebDriver driver;
	

    @FindBy(xpath="//*[@id=\'payform\']/div/a[2]")
	WebElement cardPayment;
	
	@FindBy(xpath="//*[@id='payment-form']/div[1]/div[1]/div/div/input")
	WebElement cardName;

	@FindBy(xpath="//*[@id=\'cardnumberunique\']")
	WebElement cardNumber;
	@FindBy(xpath="(//*[@data-openpay-card='expiration_month'])[2]")
	WebElement cardExpMonth;

	@FindBy(xpath="(//input[@name='expyear'])[2]")
	WebElement cardExpYear;
	@FindBy(xpath="(//input[@name='cvvno'])[2]")
	WebElement cardCVV;

	@FindBy(xpath="(//*[@id='email_block']/div/div/input)[1]")
	WebElement Email;
	

	@FindBy(css="#paylimit")
	WebElement Activate;
	
	public UndoPayment( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}


	/**
	 * @return the card
	 */
	public WebElement getCardPayment() {
		return cardPayment;
	}


	/**
	 * @return the cardName
	 */
	public WebElement getCardName() {
		return cardName;
	}


	/**
	 * @return the cardNumber
	 */
	public WebElement getCardNumber() {
		return cardNumber;
	}


	/**
	 * @return the cardExpMonth
	 */
	public WebElement getCardExpMonth() {
		return cardExpMonth;
	}


	/**
	 * @return the cardExpYear
	 */
	public WebElement getCardExpYear() {
		return cardExpYear;
	}


	/**
	 * @return the cardCVV
	 */
	public WebElement getCardCVV() {
		return cardCVV;
	}


	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return Email;
	}


	/**
	 * @return the activate
	 */
	public WebElement getActivate() {
		return Activate;
	}
	
	
	

}
