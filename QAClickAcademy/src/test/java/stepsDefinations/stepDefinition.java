package stepsDefinations;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.Assert;

import PageObjects.Home;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition extends base 
{
	@Given("^Initialize the browser and Navigate to \"([^\"]*)\" Site$")
    public void initialize_the_browser_and_navigate_to_something_site(String arg1) throws Throwable {
		driver=IntializeDriver();
		driver.get(arg1);
    }  
	@When("^Click on login link in home page to land on secure sign in page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
    	System.out.println("landing_begin");
    	LandingPage l=new LandingPage(driver);
 		if(l.getPopUpSize()>0)
		{
			l.getPopUp().click();
		}
		l.getLogin().click(); 	
		System.out.println("landing_last");
    }
	@Then("^User navigate to login page$")
    public void user_navigate_to_login_page() throws Throwable {
        System.out.println("Login Page is displayed");
    }
    
	@When("^Users enters (.+) and (.+) and login$")
    public void users_enters_and_and_login(String username, String password) throws Throwable {
    	LoginPage ln = new LoginPage(driver);
		System.out.println("login_begin");
		ln.getEmail().sendKeys(username);
		ln.getPassword().sendKeys(password);
		ln.getLogin().click();
		System.out.println("login_last");
    }
 
	@Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
    	Home h = new Home(driver);
    	Assert.assertTrue(h.getSearch().isDisplayed());
    }
    
	@And("^Close browser$")
    public void close_browser() throws Throwable {
        driver.close();
    }
}
