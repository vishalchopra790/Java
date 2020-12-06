package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UndoHomepage {
	public WebDriver driver;
	
	//private By rechargeSection=By.xpath("//div[contains(@class,'menulist')]//a[1]");
//	private By selectOperatorClick=By.cssSelector("input[name='operator']");
//	private By telcelOperator=By.xpath("//div[@class='suggestion']//li[1]");
//	private By mobileNumber=By.xpath("//div[@id='col-sm-12']/form/div/div/div/div[2]/ul/li[2]//input");
//	private By rechargePack=By.xpath("//div[@id='col-sm-12']/form/div/div/div/div[2]/ul/li[3]//input");
//	private By rechargeCategory=By.xpath("//div[@for='cat1']");
//	private By rechargeTopUp=By.xpath("//div[@class='suggestion']/ul[1]/li[1]");
//	private By rechargeClick=By.xpath("//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[3]/div/button");
	@FindBy(xpath = "//div[contains(@class,'menulist')]//a[1]")
	WebElement rechargeSection;
	@FindBy(css = "input[name='operator']")
	WebElement selectOperatorClick;
	@FindBy(xpath = "//div[@class='suggestion']//li[1]")
	WebElement telcelOperator;
	@FindBy(xpath = "//div[@id='col-sm-12']/form/div/div/div/div[2]/ul/li[2]//input")
	WebElement mobileNumber;
	@FindBy(xpath = "//div[@id='col-sm-12']/form/div/div/div/div[2]/ul/li[3]//input")
	WebElement rechargePack;
	@FindBy(xpath = "//div[@for='cat1']")
	WebElement rechargeCategory;
	@FindBy(xpath = "//div[@class='suggestion']/ul[1]/li[1]")
	WebElement rechargeTopUp;
	@FindBy(xpath = "//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[3]/div/button")
	WebElement rechargeClick;
	
	
	
	public UndoHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	/**
	 * @return the rechargeSection
	 */
	public WebElement getRechargeSection() {
		return rechargeSection;
	}



	/**
	 * @return the selectOperatorClick
	 */
	public WebElement getSelectOperatorClick() {
		return selectOperatorClick;
	}



	/**
	 * @return the telcelOperator
	 */
	public WebElement getTelcelOperator() {
		return telcelOperator;
	}



	/**
	 * @return the mobileNumber
	 */
	public WebElement getMobileNumber() {
		return mobileNumber;
	}



	/**
	 * @return the rechargePack
	 */
	public WebElement getRechargePack() {
		return rechargePack;
	}



	/**
	 * @return the rechargeCategory
	 */
	public WebElement getRechargeCategory() {
		return rechargeCategory;
	}



	/**
	 * @return the rechargeTopUp
	 */
	public WebElement getRechargeTopUp() {
		return rechargeTopUp;
	}



	/**
	 * @return the rechargeClick
	 */
	public WebElement getRechargeClick() {
		return rechargeClick;
	}

	

}
