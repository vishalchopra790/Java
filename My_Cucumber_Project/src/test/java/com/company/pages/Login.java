package com.company.pages;

import com.company.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public Login(){
        PageFactory.initElements(DriverUtil.getDriver(),this);

    }
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(css = "[type='submit']")
    public WebElement submit;
    @FindBy(xpath = "//*[@class='vs-login-col'] /div[3]/div[2]")
    public WebElement errorMessage;
    @FindBy(css="[href='/forgot_password']")
    public WebElement forgotpassword;
}
