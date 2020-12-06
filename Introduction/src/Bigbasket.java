import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		String[] itemsNeeded = { "Tomato - Hybrid","Palak"};
		
		int j=0;
		System.setProperty("webdriver.chrome.driver", "C:\\XL_Apps\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com");
		//System.out.println(driver.getTitle());

		// Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)");
		driver.findElement(By.cssSelector("img[src='//www.bigbasket.com/media/customPage/b01eee88-e6bc-410e-993c-dedd012cf04b/35fdd2de-6305-4fc4-9a1f-f415c0d9f114/4edd3652-0f82-4212-a983-36f34f423ce2/T1_All_Fruits_Vegetables_DT_1_480x360_25thApr.jpg']")).click();
		Thread.sleep(1000);
		List<WebElement> products = driver.findElements(By.cssSelector("div[qa='product_name']"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("\n");
			String format=name[1].trim();
			List namesList = Arrays.asList(itemsNeeded);
			if (namesList.contains(format))

			{
				j++;
				driver.findElements(By.xpath("//button[@qa='add'][@type='button']")).get(i).click();
				if (j == (itemsNeeded.length)) {
					break;
				}

			}
		}
		
	}
}