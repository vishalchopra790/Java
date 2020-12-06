package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	WebDriverManager.iedriver().setup();
    	WebDriver driver=new InternetExplorerDriver();
    	driver.navigate().to("https://www.google.com");
    	driver.navigate().back();
        System.out.println(driver.getTitle());
    }
}
