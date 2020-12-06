package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class3 {
	@Parameters({"URL"})
    @Test
	public void login(String url) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println(url);	
	}
    @Test(groups={"smoke"})
public void Webcarlogin()
{
	System.out.println("car login");
	}
    @BeforeMethod
    public void bm() {
    	System.out.println("I should run first");
    }
	@BeforeSuite
	public void bfrsu() {
		System.out.println("I am the first");
	}
    @Test(enabled=false)
    public void Mobilebcarlogin()
    {
    	System.out.println("car login");
    	}
    @Test(dependsOnMethods= {"Webcarlogin","login"})
    public void Apicarlogin()
    {
    	System.out.println("car login");
    	}

}
