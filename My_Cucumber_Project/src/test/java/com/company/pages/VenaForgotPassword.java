package com.company.pages;

import com.company.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VenaForgotPassword {
    public VenaForgotPassword(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
    @FindBy(css = "input[id*='input-Email']")
    public WebElement forgotEmail;
    @FindBy(css = "button[class*='jss2']:last-child")
    public WebElement sendLink;
    @FindBy(xpath ="//*[@id='forgot_password']/div/div[2]/div/div/div[1]")
    public WebElement forgotMessage;

}
