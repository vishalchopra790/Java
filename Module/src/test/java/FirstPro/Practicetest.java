package FirstPro;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.Practice;
import resources.Base;

public class Practicetest extends Base{
	public WebDriver driver;
	Practice p;
	
	@BeforeTest
	public void start() throws IOException {
		driver=intDrivers();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
	@Test
	public void radio() {
		p=new Practice(driver);
		p.radio().click();
		
	}

	@Test
	public void suggestion() throws InterruptedException {
		p=new Practice(driver);
		p.suggestion().click();
		p.suggestion().sendKeys("del");
		System.out.println(p.suggestion().getAttribute("value"));
		Thread.sleep(2000);
		p.suggestion().sendKeys(Keys.DOWN);
		p.suggestion().sendKeys(Keys.ENTER);
		System.out.println(p.suggestion().getAttribute("value"));
		//p.suggestion().clear();
		
	}
	@Test
	public void dropdown() {
		p=new Practice(driver);
		Select s=new Select(p.dropdown());
		s.selectByIndex(1);
		
		}
	@Test
	public void checkbox() {
		p=new Practice(driver);
		p.checkbox().click();
		
	}
	@Test
	public void window() throws InterruptedException {
		p=new Practice(driver);
		p.window().click();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		String parentchild=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		try {
		driver.findElement(By.xpath("//*[contains(text(),'NO THANKS')]")).click();
		}catch(Exception E)
		{
			System.out.println("All clear ");
		}
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("About")).getClass();
	}
}
