import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Remote {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities c= new DesiredCapabilities();
		c.setBrowserName("chrome");
		c.setPlatform(Platform.WINDOWS);
		
		WebDriver driver=new RemoteWebDriver(new URL(" http://192.168.0.105:4444/wd/hub"),c);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());

	}

}
