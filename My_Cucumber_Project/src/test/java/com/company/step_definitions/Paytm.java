package com.company.step_definitions;

import com.company.utilities.DriverUtil;
import com.company.utilities.JSUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.util.List;


public class Paytm {
    String expected;
    String actual;
    int linkCounts;
    List<WebElement> links;


    @Given("user land on {string} webpage")
    public void user_land_on_webpage(String url) {
        DriverUtil.getDriver().get(url);
    }

    @When("grab the page title")
    public void grab_the_page_title() {
        expected = "Paytm.com – Recharge & Utility Payments, Entertainment, Travel, DTH, Wallet & Payments";
        actual = DriverUtil.getDriver().getTitle();

    }

    @Then("Verify the page title")
    public void verify_the_page_title() {
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);

    }


    @When("links should be collected into one list")
    public void linksShouldBeCollectedIntoOneList() {
        List<WebElement> links = DriverUtil.getDriver().findElements(By.tagName("a"));
        linkCounts = links.size();
        System.out.println(linkCounts);


    }

    @Then("verify if any link is broken or not")
    public void verifyIfAnyLinkIsBrokenOrNot() {
        JSUtil.pageLoadComplete();

        List<WebElement> links = DriverUtil.getDriver().findElements(By.tagName("a"));
       links.addAll(DriverUtil.getDriver().findElements(By.tagName("img")));

        System.out.println("Total links are " + links.size());

        for (int i = 0; i < links.size(); i++) {
            //DriverUtil.getDriver().navigate().refresh();
            try {
                WebElement ele = links.get(i);

                String url = ele.getAttribute("href");



               JSUtil.verifyLinkActive(url);

            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
        }
    }
}




