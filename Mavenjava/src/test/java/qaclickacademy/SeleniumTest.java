package qaclickacademy;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.Test;

public class SeleniumTest {	
	ExtentReports extent;
@BeforeTest
public void config() {
	String path=System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter= new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation");
	reporter.config().setDocumentTitle("Test Results");
	
	 extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester","Vishal");
}
	
	 @Test
     public void Demo() throws InterruptedException{
		 
		ExtentTest test= extent.createTest("Vegetable");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\X133477\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.getTitle();
	driver.manage().window().maximize();
	// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	Thread.sleep(3000);

	String[] itemsNeeded = { "Cucumber", "Orange", "Pears", "Onion" };
	WebDriverWait w = new WebDriverWait(driver, 5);
	addItems(driver, itemsNeeded);
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();

	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span[class='promoInfo']")));
	System.out.println(driver.findElement(By.cssSelector("span[class='promoInfo']")).getText());
	test.fail("failure");
    extent.flush();
}

public static void addItems(WebDriver driver, String[] itemsNeeded) {
	int j = 0;
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

	for (int i = 0; i < products.size(); i++) {
		// System.out.println(products.get(i).getText());
		String[] name = products.get(i).getText().split("-");
		String formatName = name[0].trim();
		// covert array into array list
		// check whether the items present in array list could be selected

		List namesList = Arrays.asList(itemsNeeded);

		if (namesList.contains(formatName)) {
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if (j == (itemsNeeded.length)) {
				break;
			}
		}}

	}



     @Test
	public void element()
	{
		System.out.println("element");
	}
}
