import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBclass {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
	Connection con=	DriverManager.getConnection("jdbc:mysql://" + host + ":"+port+"/QADBT","root","1234");
   Statement s= con.createStatement();
 ResultSet rs=  s.executeQuery("select * from employees where location='USA'");
 while(rs.next()) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\X133477\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys(rs.getString("Empname"));
		driver.findElement(By.xpath("//input[@name='pw']")).sendKeys(rs.getString("Age"));
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
 
   
	}

}
}
