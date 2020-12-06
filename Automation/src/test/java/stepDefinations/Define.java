package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Define {

    @Given("^User is on the Netbanking landing page$")
    public void user_is_on_the_netbanking_landing_page() throws Throwable {
        System.out.println("User reached landing page");
    }

    @When("^User login into application with username \"([^\"]*)\" name and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_name_and_password_something(String strArg1, String strArg2) throws Throwable {
    
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("User sucessfully logged in"); 
    }

    @And("^Cards are displayed \\\"([^\\\"]*)\\\"$")
    public void cards_are_displayed(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }

}
