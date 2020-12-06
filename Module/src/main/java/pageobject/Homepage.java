package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
  public WebDriver driver;
	private By name =By.name("name");
	private By email=By.name("email");
	private By password=By.cssSelector("input[type=password");
	private By checkbox=By.id("exampleCheck1");
	private By gender=By.id("exampleFormControlSelect1");
	private By option3=By.cssSelector("input[value='option2']");
	private By dob=By.xpath("//input[@type='date']");
	private By submit=By.xpath("//input[@type='submit']");
	private By success=By.cssSelector("div[class*='dismissible'] strong");
	private By shop=By.linkText("Shop");
	
	
	
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getName() {
		return driver.findElement(name);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getCheckBox() {
		return driver.findElement(checkbox);
	}
	public WebElement getGender() {
		return driver.findElement(gender);
	}
	public WebElement getOption3() {
		return driver.findElement(option3);
	}
	public WebElement getDob() {
		return driver.findElement(dob);
	}
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
	public WebElement getSuccess() {
		return driver.findElement(success);
	}
	public WebElement getShop() {
		return driver.findElement(shop);
	}
	
	
}
