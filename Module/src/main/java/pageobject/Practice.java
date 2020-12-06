package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice {
 
	public WebDriver driver;
	
	private By radio=By.cssSelector("input[value='radio2']");
	private By suggestion=By.cssSelector("input[id='autocomplete']");
	private By dropdown=By.id("dropdown-class-example");
	private By checkbox=By.xpath("//input[@value='option2']");
	private By window=By.id("openwindow");
	private By secondwindow=By.xpath("//*[contains(text(),'Courses')]");
	
	public Practice(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement radio() {
		return driver.findElement(radio);
	}
	public WebElement suggestion() {
		return driver.findElement(suggestion);
	}
	public WebElement dropdown() {
		return driver.findElement(dropdown);
	}
	public WebElement checkbox() {
		return driver.findElement(checkbox);
	}
	public WebElement window() {
		return driver.findElement(window);
	}
	public WebElement secondwindow() {
		return driver.findElement(secondwindow);
	}
	
}
