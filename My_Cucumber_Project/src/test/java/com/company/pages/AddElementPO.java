package com.company.pages;

import com.company.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddElementPO {

    public AddElementPO(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
  @FindBy(linkText = "Add/Remove Elements")
    WebElement addElement;

    @FindBy(css=".example button")
    WebElement addButton;

    @FindBy(xpath="(//button[@class='added-manually'])")
    WebElement deleteButton;

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getAddElement() {
        return addElement;
    }

    public WebElement getAddButton() {
        return addButton;
    }
}
