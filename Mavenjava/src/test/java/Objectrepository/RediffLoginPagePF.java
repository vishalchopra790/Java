package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	public RediffLoginPagePF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//input[@name='proceed']")
	WebElement go;
	@FindBy(linkText="rediff.com")
	WebElement home;

	public WebElement username() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement go() {
		return go;
	}
	public WebElement home() {
		return home;
	}
}
