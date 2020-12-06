package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class sample {
    

		// TODO Auto-generated method stub
		@Test	
		public void set() {
		System.setProperty("webdriver.ie.driver","C:\\Users\\X133477\\.eclipse\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://facebook.com");
        
	

}
}