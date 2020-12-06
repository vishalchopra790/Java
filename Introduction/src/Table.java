import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\X133477\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/22883/nzxi-vs-ind-3-day-practice-match-india-tour-of-new-zealand-2020");
		int sum = 0;
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();

		for (int i = 0; i < count - 2; i++) {
			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int value1 = Integer.parseInt(value);
			sum = sum + value1;

		}

		String extra = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extra1 = Integer.parseInt(extra);
		sum = sum + extra1;

		String total = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int total1 = Integer.parseInt(total);

		if (sum == total1) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}

	}
}
