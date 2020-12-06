import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablecheck {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\X133477\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector("tr th:nth-child(2")).click();
        List<WebElement> a=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
        
        ArrayList<String> original=new ArrayList<String>();
        for(int i=0;i<a.size();i++)
        {
        	original.add(a.get(i).getText());
        }
        for(String s : original)
        {
        	System.out.println(s);
        }
        ArrayList<String> copied=new ArrayList<String>();
        for(int i=0;i<original.size();i++)
        {
        	copied.add(a.get(i).getText());
        }
       
        Collections.sort(copied);
        Collections.reverse(copied);
        System.out.println("**************************************7");
        for(String s : copied)
        {
        	System.out.println(s);
        }
       Assert.assertTrue(original.equals(copied));
	}

}
