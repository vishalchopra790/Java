import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileuploAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String download= System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\X133477\\Downloads\\chromedriver.exe");
	    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", download);
        ChromeOptions options =new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--incognito");
	
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		 //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.cssSelector("button[class*='g-btn--choose']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\X133477\\Desktop\\fileupload.exe");
		//Thread.sleep(15000);
		WebDriverWait w = new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='g-btn--medium']")));
		
		driver.findElement(By.cssSelector("button[class*='g-btn--medium']")).click();
		//WebDriverWait c = new WebDriverWait(driver,40);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));
		
		driver.findElement(By.linkText("Download Now")).click();
		File f=new File(download+"/Converted.zip");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());

			if (f.delete())

				System.out.println("file deleted");
		}

	}

}
