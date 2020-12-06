package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	public RediffLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	WebDriver driver;
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By go = By.xpath("//input[@name='proceed']");
	By home=By.linkText("rediff.com");

	public WebElement username() {
		return driver.findElement(username);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement go() {
		return driver.findElement(go);
	}
	public WebElement home() {
		return driver.findElement(home);
	}
}
