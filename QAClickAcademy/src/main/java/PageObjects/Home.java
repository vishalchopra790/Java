package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	public WebDriver driver;
	
	public Home(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);		
	}
	
	By Search = By.xpath("//input[@id='search-courses']");
	
	
	public WebElement getSearch()
	{
		return driver.findElement(Search);
	}
	
	// 

}
