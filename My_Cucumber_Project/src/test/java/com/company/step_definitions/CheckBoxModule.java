package com.company.step_definitions;

import com.company.pages.CheckBox;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class CheckBoxModule {
    CheckBox c=new CheckBox();
    @Then("i should see checkbox link")
    public void i_should_see_checkbox_link() {
        if(c.cblink.isDisplayed()){
            Assert.assertTrue(true);
        }else{
            Assert.assertFalse(false);
        }
    }

    @When("I clicked on checkbox module")
    public void i_clicked_on_checkbox_module() {
        // Write code here that turns the phrase above into concrete actions
        c.cblink.click();
    }

    @Then("I should navigated to new page and verify checkbox heading")
    public void i_should_navigated_to_new_page_and_verify_checkbox_heading() {
        if(c.title.equals("Checkboxes")){
            Assert.assertTrue(true);
        }else{
            Assert.assertFalse(false);
        }
    }

    @Then("I should see two checkboxes")
    public void i_should_see_two_checkboxes() {
       Assert.assertEquals(c.checkboxesList.size(),2);
        System.out.println(c.checkboxesList.size());

    }

    @Then("By default checkbox2 should be  selected")
    public void by_default_checkbox2_should_be_selected() {
        Assert.assertTrue(c.checkbox2.isSelected());
    }

    @When("I check checkbox1 and uncheck checkbox2")
    public void i_check_checkbox1_and_uncheck_checkbox2() {
       c.checkbox1.click();
       c.checkbox2.click();
    }

    @Then("Only checkbox1 should be selected and checkbox2 unchecked")
    public void only_checkbox1_should_be_selected_and_checkbox2_unchecked() {
        Assert.assertTrue(c.checkbox1.isSelected());
        Assert.assertFalse(c.checkbox2.isSelected());
    }

}
