package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
    @Test(groups={"smoke"})
	public void Demo() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
    @AfterSuite
    public void aftrsu(){
    	System.out.println("I am the last");
    }
    @Test
public void prerequiste()
{
	System.out.println("jai mata di");
	}
	

}
