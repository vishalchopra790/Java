package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {
	//public static final String USERNAME = "vishalchopra790";

	//public static final String ACCESS_KEY = "0e1a2a50-517c-4e34-9e34-727253100792";

	//public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public Properties prop;
	public WebDriver driver;

	public WebDriver Intdrivers() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		/*if (browserName.contains("chrome")) 

		{
			DesiredCapabilities caps = DesiredCapabilities.chrome();
			caps.setCapability("platform", "Windows 8.1");
			caps.setCapability("version", "80.0");

	         driver = new RemoteWebDriver(new URL(URL), caps);

			
		}*/
		if (browserName.contains("chrome"))

		{

			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();

			if (browserName.contains("headless"))

			{

				options.addArguments("headless", "user-agent=mrbean");

			}

			driver = new ChromeDriver(options);}

			/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\X133477\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions();

			if (browserName.contains("headless"))

			{

				options.addArguments("headless", "user-agent=mrbean");

			}

			driver = new ChromeDriver(options);
		}*/

		else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\X133477\\.eclipse\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
		return driver;

	}

	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
}
