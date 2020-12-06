package stepDefinations;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObject.LandingPage;
import pageObject.PortalPage;
import pageObject.forget;
import pageObject.loginPF;
import resources.Drivers;

@RunWith(Cucumber.class)
public class Define extends Drivers {
	LandingPage p;
	loginPF l;
	forget fp;
	@Given("Intialize the browser with chrome")
	public void intialize_the_browser_with_chrome() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		driver = Intdrivers();
	}

	@Given("Navigate to {string}")
	public void navigate_to(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.get(string);
	}

	@Given("Click on Login link on home and laded to secure login page")
	public void click_on_Login_link_on_home_and_laded_to_secure_login_page() {
		// Write code here that turns the phrase above into concrete actions
		p = new LandingPage(driver);
		l = p.signin();
	}

	@When("^User login into application with username (.+) and password (.+)$")
	public void user_login_into_application_with_username_and_password(String username, String password)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		l.getEmail().sendKeys(username);
		l.getPassword().sendKeys(password);

		l.getSubmit().click();
	}

	@Then("Verifu user is sucessfully login")
	public void verifu_user_is_sucessfully_login() {
		// Write code here that turns the phrase above into concrete actions
		PortalPage pp = new PortalPage(driver);
		try {
	  Assert.assertTrue(pp.getSearch().isDisplayed());
	}catch(Exception E) {
		System.out.println("Not Displayed");
	}
	}
	@Then("Close the browser")
	public void close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
          driver.quit();
	}
	@Then("Invalid credentials")
	public void invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	 Assert.assertEquals(l.getText(),"Invalid email or password.", "Incorrect credentials");
	}

	@Then("User will navigate to forgot password page")
	public void user_will_navigate_to_forgot_password_page() {
	    // Write code here that turns the phrase above into concrete actions
		 fp=l.forget();
	
	}


    @Then("^User will insert email for setting the password (.+)$")
    public void user_will_insert_email_for_setting_the_password(String username) throws Throwable {
    	fp.getEmail().sendKeys("vishalchopra@gmail.com");
		fp.submit().click();
}
}