package com.company.pages;

import com.company.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBox {

    public CheckBox() {
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }
    @FindBy(linkText = "Checkboxes")
    public WebElement cblink;
    @FindBy(css=".example h3")
   public  WebElement title;
    @FindBy(xpath = "//body//input[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "//body//input[2]")
    public WebElement checkbox2;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkboxesList;

}
