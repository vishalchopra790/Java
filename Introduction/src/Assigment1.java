import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Assigment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    //invoke .exe file
		
		String text="Vishal";
		System.setProperty("webdriver.chrome.driver","C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		

		
		//Check the check box
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());	
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		
		Thread.sleep(3000);
	//Uncheck
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());	
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());	
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        
        
       //Alert
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.cssSelector("#alertbtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        
      //Confirm 
        driver.findElement(By.cssSelector("#confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        
        
        Thread.sleep(2000);
        
        
		driver.close();
		
		
		
}
}