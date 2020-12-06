package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class4 {
    @AfterTest
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Jai Guru Ji");
	}
    @Test(groups={"smoke"})
public void Webloanlogin()
{
	System.out.println("car login");
	}
	
    @Test
    public void Mobileloanlogin()
    {
    	System.out.println("car login");
    	Assert.assertTrue(false);
    	}
    
    @Test(dataProvider= "getdata")
    public void Apialoanlogin(String username , String password)
    {
    	System.out.println("car login");
    	System.out.println(username);
    	System.out.println(password);
    	}
    @DataProvider
    public Object[][] getdata()
    {
    	Object[][] data =new Object[3][2];
    	data[0][0]="first username";
    	data[0][1]="first password";
    	data[1][0]="second username";
    	data[1][1]="second password";
    	data[2][0]="third username";
    	data[2][1]="third password";
    	return data;
    }

}
