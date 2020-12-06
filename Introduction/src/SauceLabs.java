import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabs {

	public static final String USERNAME = "vishalchopra790";

	public static final String ACCESS_KEY = "0e1a2a50-517c-4e34-9e34-727253100792";

	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {

// TODO Auto-generated method stub

		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setCapability("platform", "Linux");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

		driver.get("http://google.com");

		System.out.println(driver.getTitle());
		driver.close();

	}

}
