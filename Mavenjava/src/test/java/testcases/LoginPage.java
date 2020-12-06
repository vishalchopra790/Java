package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.RediffHome;
import Objectrepository.RediffHomePF;
import Objectrepository.RediffLoginPage;
import Objectrepository.RediffLoginPagePF;

public class LoginPage {
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPagePF rl=new RediffLoginPagePF(driver);
		rl.username().sendKeys("jai");
		rl.password().sendKeys("jaimata");
		rl.go().click();
		rl.home().click();
		RediffHomePF rh=new RediffHomePF(driver);
		rh.search().sendKeys("toys");
		rh.submit().click();
	}

}
