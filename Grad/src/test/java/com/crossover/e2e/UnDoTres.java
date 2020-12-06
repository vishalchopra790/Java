package com.crossover.e2e;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import PageObject.UndoHomepage;
import PageObject.UndoLogin;
import PageObject.UndoPayment;
import resources.Base;


public class UnDoTres extends Base {

	public WebDriver driver;

	public static Logger log=LogManager.getLogger(UnDoTres.class.getName());

	@BeforeTest
	public void setUp() throws Exception {

		driver = intDrivers();
		log.info("Driver invoked Successfully");
		driver.get(prop.getProperty("url"));
		log.info("Webpage load succesfully");
	}

	@Test(priority = 1)
	public void verifyHomePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("return document.readyState").equals("complete");
		String actualTitle = "UnDosTres - Recargas en línea Telcel, Movistar, AT&T, Unefon, Virgin, Televia, Pase, Boletos de Cine, Pagos CFE";
		String title = driver.getTitle();
		log.info(title);
		Assert.assertEquals(title, actualTitle);

	}

	@Test(priority = 2, enabled = true)
	public void Recharge() throws InterruptedException {
		UndoHomepage uhp = new UndoHomepage(driver);
		// recharge section
		uhp.getRechargeSection().click();
		// operator
		uhp.getSelectOperatorClick().click();
		uhp.getTelcelOperator().click();
		// mobile number
		uhp.getMobileNumber().sendKeys(prop.getProperty("mobileNumber"));
		// recharge pack
		uhp.getRechargePack().click();
		// Recharges category
		uhp.getRechargeCategory().click();

		/// top up
		uhp.getRechargeTopUp().click();

		// Siguiente click
		uhp.getRechargeClick().click();

	}

	@Test(priority=3)
	public void verifyPaymentPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-info-box']/span/a")));
		String expectedTitle = "undostres.com.mx - Recargas en línea Telcel, Movistar, Iusacell, Unefon, Nextel, Virgin, Cierto, Weex, Televia, Pase Urbano, IAVE, Viapass";

		try {
			Assert.assertEquals(expectedTitle, driver.getTitle());
			log.info("Navigated to Payment webpage");
		} catch (Throwable pageNavigationError) {
			log.error("Didn't navigate to payment webpage");
		}

	}

	@Test(priority = 4)
	public void payment() {
		System.out.println(driver.getTitle());
		UndoPayment up = new UndoPayment(driver);
		// select card paymment
		up.getCardPayment().click();

		// card name
		up.getCardName().click();
		up.getCardName().sendKeys(prop.getProperty("creditCName"));
		// card number
		up.getCardNumber().click();
		up.getCardNumber().sendKeys(prop.getProperty("cardNumber"));
		// card exp month
		up.getCardExpMonth().click();
		up.getCardExpMonth().sendKeys(prop.getProperty("cardExpMon"));
		// card exp year
		up.getCardExpYear().sendKeys(prop.getProperty("cardExpYear"));
		// card cvv
		up.getCardCVV().sendKeys(prop.getProperty("cardCVV"));
		// email
		up.getEmail().click();
		up.getEmail().sendKeys(prop.getProperty("email"));
		// submit
		up.getActivate().click();

	}

	@Test(priority = 5)
	public void login() throws InterruptedException {
		UndoLogin ul = new UndoLogin(driver);
		// username
		ul.getUsername().sendKeys(prop.getProperty("username"));
		// password
		ul.getPassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		// captcha verification
		WebElement fr = ul.getCaptchaFrame();
		driver.switchTo().frame(fr);
		ul.getCaptchaClick().click();
		driver.switchTo().defaultContent();
		// login submit
		ul.getLoginClick().click();

	}

	
	@AfterTest
	public void after() {
		driver.quit();
		log.info("Driver closed sucessfully");
	}
}
