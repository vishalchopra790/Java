package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
  public WebDriver driver;
  public Properties prop;
	
	public WebDriver intDrivers() throws IOException {
		prop=new Properties();
	FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\main\\\\java\\\\resources\\\\data.properties");
	
	prop.load(fi);
	String browserName=prop.getProperty("browser");
	
	if(browserName.contains("chrome")) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\\\\\\\src\\\\\\\\main\\\\\\\\java\\\\\\\\resources\\\\\\\\\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		if(browserName.contains("headless"))
		{
			options.addArguments("headless");
		}
		 driver=new ChromeDriver(options);
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	public String getScreenshotPath(String testCaseName,WebDriver driver) throws IOException {
		TakesScreenshot ts=	(TakesScreenshot) driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(Source,new File(destinationFile));
		return destinationFile;
	}
}
