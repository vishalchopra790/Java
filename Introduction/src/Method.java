
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method {
	

	public static  void addItems(WebDriver driver,String[] itemsNeeded) {
		
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			//System.out.println(products.get(i).getText());
			String[] name = products.get(i).getText().split("-");
			String formatName = name[0].trim();
			// covert array into array list
			// check whether the items present in array list could be selected
			
			List namesList = Arrays.asList(itemsNeeded);
			

			if (namesList.contains(formatName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j ==(itemsNeeded.length)) {
					break;
				}
			}
	}

}

	public void Method() {
		// TODO Auto-generated method stub
		
	}
}