package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shop {
	
	public WebDriver driver;
	private By category1=By.linkText("Category 1");
	
	public Shop(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getCategory1() {
		return driver.findElement(category1);
	}

}
