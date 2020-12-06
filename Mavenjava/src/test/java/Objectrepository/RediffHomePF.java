package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePF {

	public RediffHomePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
  
  
	@FindBy(xpath="//input[@id='srchword']")
	WebElement search;
	 @FindBy(xpath="//form[@id='queryTop']//input[@class='newsrchbtn']")
		WebElement submit;

	public WebElement search() {
		return search;
	}
	public WebElement submit() {
		return submit;
	}
}
