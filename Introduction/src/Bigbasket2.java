import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bigbasket2 {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		String[] itemList = { "Orange", "Apple", "Banana" };

		System.setProperty("webdriver.chrome.driver", "C:\\\\XL_Apps\\\\eclipse\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.bigbasket.com/");

		driver.findElement(By.xpath("//*[@id=\"dynamicDirective\"]/non-linear[1]/section/div[2]/div/div[1]")).click();

		List<WebElement> productnames = driver.findElements(By.xpath("//div[@qa='product_name']/a"));

//	System.out.println(productnames.size());

		for (int i = 0; i < productnames.size(); i++) {

//	System.out.println(productnames.get(i).getText());

			String[] productname_list = productnames.get(i).getText().split("-");

//	System.out.println(productname_list[0]);

			String productname_list_formated = productname_list[0].trim();

//	System.out.println(productname_list_formated);

			List<String> product_arr_to_list = Arrays.asList(itemList);

			if (product_arr_to_list.contains(productname_list_formated)) {

				driver.findElements(By.xpath("//button[@qa='add'][@type='button']")).get(i).click();

				Thread.sleep(2000);

				System.out.println("1 " + productname_list_formated + " added to basket");

				if (i == 0) {

					driver.findElement(By.xpath("//div[@class=\"dropdown-menu latest-at-bb\"]//a[@qa=\"continueBtn\"]"))
							.click();

					Thread.sleep(2000);

				}

				if (i == itemList.length) {

					break;

				}

			}

		}

	}

}