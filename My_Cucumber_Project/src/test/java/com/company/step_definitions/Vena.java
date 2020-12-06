package com.company.step_definitions;

import com.company.pages.Login;
import com.company.pages.VenaForgotPassword;
import com.company.pages.VenaProfile;
import com.company.utilities.BrowserUtils;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Vena {
    Login log = new Login();
    VenaProfile vp = new VenaProfile();
    VenaForgotPassword vfp = new VenaForgotPassword();
    @Given("User must land on login page")
    public void user_must_land_on_login_page() {
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().get("https://vena.io/");
    }



//    @When("user login with username and password")
//    public void user_login_with_username_and_password() throws InterruptedException {
//
//        DriverUtil.getDriver().findElement(By.id("email")).sendKeys("vishal.chopra@axaxldev.com");
//        DriverUtil.getDriver().findElement(By.id("password")).sendKeys("C0mmunication@6");
//        DriverUtil.getDriver().findElement(By.cssSelector("[type='submit']")).click();
//
//    }
//
//    @Then("user land into home page and confirm user navigated to right url")
//    public void user_land_into_home_page_and_confirm_user_navigated_to_right_url() throws InterruptedException {
//                String rightUrl="https://eu1.vena.io/new_manager";
//                Thread.sleep(10000);
//        Assert.assertEquals(DriverUtil.getDriver().getCurrentUrl(),rightUrl);
//    }
//
//
//    @Given("User is currently on manager tab")
//    public void userIsCurrentlyOnManagerTab() {
//
//        WebElement manager=DriverUtil.getDriver().findElement(By.xpath("//*[@id='new_manager']/div[1]/div/div/div[1]/h1/text()[1]"));
//        System.out.println(manager.getText());
//        Assert.assertEquals(manager.getText(),"Manager");
//    }
//
//    @When("user should  navigate to contributor tab by clicking on contributor")
//    public void userShouldNavigateToContributorTabByClickingOnContributor() {
//        DriverUtil.getDriver().findElement(By.linkText("Contributor")).click();
//
//    }
//
//
//    @And("user click on input form")
//    public void userClickOnInputForm() {
//        String inputForms="//*[@data-id='688049994066690048']/td[3]";
//        BrowserUtils.waitForVisibility(inputForms);
//        WebElement inputFormss=DriverUtil.getDriver().findElement(By.xpath("//*[@data-id='688049994066690048']/td[3]"));
//        JSUtil.clickElementByJS(inputFormss);
//        //inputForms.click();
//    }

    @When("user login with {string} and {string}")
    public void user_login_with_and(String username, String password) {
       BrowserUtils.fluentWait(log.email, DriverUtil.getDriver());
        log.email.sendKeys(username);
        log.password.sendKeys(password);
        log.submit.click();
    }

    @Then("Verify user logged into profile with {string}")
    public void verify_User_Logged_Into_Profile_With_Username(String profileName) {
        BrowserUtils.waitForVisibility(".js-vena-nav-log-out");
        Assert.assertEquals(vp.VerifyUser.getText(), profileName);
        DriverUtil.getDriver().manage().deleteAllCookies();
    }

    @When("user login with wrong {string} and {string} and click submit")
    public void user_Login_With_Wrong_And_And_Click_Submit(String username, String password) {
        log.email.sendKeys(username);
        log.password.sendKeys(password);
        log.submit.click();
    }

    @Then("A pop up will {string}")
    public void a_Pop_Up_Will(String message) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(log.errorMessage.getText(), message);
    }

    @And("User click on logout button")
    public void user_Click_On_Logout_Button() {
        vp.logout.click();
        vp.confirmLogout.click();
    }

    @When("user click on forgot pasword")
    public void user_Click_On_Forgot_Pasword() {
        log.forgotpassword.click();
    }

    @Then("user navigated to forgot password webpage")
    public void user_Navigated_To_Forgot_Password_Webpage() {
        String expectedUrl = "https://vena.io/forgot_password";
        Assert.assertEquals(DriverUtil.getDriver().getCurrentUrl(), expectedUrl);
    }

    @When("user insert {string} email  address to get new password reset link on email")
    public void user_Insert_Email_Address_To_Get_New_Password_Reset_Link_On_Email(String email) {
        vfp.forgotEmail.sendKeys(email);
        vfp.sendLink.click();
    }

    @Then("Message Display {string}")
    public void message_display(String message2) {
        BrowserUtils.wait(10000);
        BrowserUtils.waitForVisibility("//*[@id='forgot_password']/div/div[2]/div/div/div[4]/button/span[1]");
        System.out.println(message2);
        Assert.assertEquals(vfp.forgotMessage.getText(), message2);
        DriverUtil.getDriver().findElement(By.xpath("//*[@id='forgot_password']/div/div[2]/div/div/div[4]/button/span[1]")).click();
    }
}
