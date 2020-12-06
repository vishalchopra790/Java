package alpha;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

public class Demo {
    private static Logger log=  LogManager.getLogger(Demo.class.getName());
    @Test
	public void Demo() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\XL_Apps\\\\eclipse\\\\chromedriver.exe");
		log.debug("Invoking the browser");
		WebDriver driver=new ChromeDriver();
		log.info("Driver Invoked Successfully");
		log.debug("Hitting the facebook URL");
		driver.get("https://www.facebook.com");
		log.info("Webpage opened Sucessfully");
	}

}
