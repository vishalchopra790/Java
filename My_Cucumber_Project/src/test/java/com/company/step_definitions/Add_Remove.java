package com.company.step_definitions;

import com.company.pages.AddElementPO;
import com.company.utilities.ConfigReader;
import com.company.utilities.DriverUtil;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Add_Remove {
    AddElementPO a=new AddElementPO();
    @Given("User navigate to homepage")
    public void user_navigate_to_homepage() {
        DriverUtil.getDriver().get(ConfigReader.getProperty("herURL"));
    }

    @Then("Add remove element should be displayed")
    public void add_remove_element_should_be_displayed() {

        if(a.getAddElement().isDisplayed()) {
            Assert.assertTrue(a.getAddElement().isDisplayed());
            System.out.println("displayed");
        }else{
            System.out.println("not displayed");
        }
    }
    @Given("user is on home page")
    public void user_is_on_home_page() {
        DriverUtil.getDriver().get(ConfigReader.getProperty("herURL"));
        String homeTitle=DriverUtil.getDriver().getTitle();
        System.out.println(homeTitle);
    }

    @When("User click on on link")
    public void user_click_on_on_link() {
        a.getAddElement().click();

    }

    @Then("user navigate to next page")
    public void user_navigate_to_next_page() {
        String nextPageTitle=DriverUtil.getDriver().getCurrentUrl();
        System.out.println(nextPageTitle);
    }

    @Then("Button must be displayed")
    public void button_must_be_displayed() {
      if(a.getAddButton().isDisplayed()){
          System.out.println("displayed");
      }else{
          System.out.println("not displayed");
      }
    }
    @When("user moved to homepage then user will click on Add elemnet")
    public void user_moved_to_homepage_then_user_will_click_on_Add_elemnet() {
        a.getAddElement().click();
        a.getAddButton().click();
    }

    @Then("Display button must visible to user")
    public void display_button_must_visible_to_user() {
        if(a.getDeleteButton().isDisplayed()){
            System.out.println("delete button  displayed");
        }else{
            System.out.println(" delete not displayed");
        }

    }
    @When("click on delete element")
    public void click_on_delete_element() {
        a.getDeleteButton().click();
    }

    @Then("user is able to see only add button")
    public void user_is_able_to_see_only_dispaly_button() {
        List<WebElement> button = DriverUtil.getDriver().findElements(By.tagName("button"));
        Assert.assertTrue(button.size() == 1);
    }





}
