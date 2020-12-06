package com.company.pages;

import com.company.utilities.DriverUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VenaProfile {
    public VenaProfile(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='accountTab']/div")
    public WebElement VerifyUser;
    @FindBy(css = ".js-vena-nav-log-out")
    public WebElement logout;
    @FindBy(xpath = "//*[@id=\"view18\"]/div/div/div/div[3]/button[1]")
    public  WebElement confirmLogout;
}
