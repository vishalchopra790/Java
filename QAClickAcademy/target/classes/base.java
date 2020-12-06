package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver IntializeDriver() throws IOException {
	prop = new Properties();
	//System.getProperty("user.dir");
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	prop.load(fis);
	//mvn test -Dbrowser=chrome
	String browserName=System.getProperty("browser");
	//String browserName=System.getProperty("browser");
	if(browserName.contains("chrome")) {
	//execute in chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\X133477\\chromedriver.exe");
	if(browserName.contains("headless")) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("headless","user-agent=mrbean");
	driver=new ChromeDriver(options);
	}
	else {
	driver=new ChromeDriver();
	}
	}
	else if(browserName.equals("firefox")) {
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/WebDrivers/geckodriver.exe");
	driver=new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}

}
