package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;

public class RediffHome {

	public RediffHome(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	WebDriver driver;
   By search=By.xpath("//input[@id='srchword']");
   By submit=By.xpath("//form[@id='queryTop']//input[@class='newsrchbtn']");
	
	public WebElement search() {
		return driver.findElement(search);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
}
