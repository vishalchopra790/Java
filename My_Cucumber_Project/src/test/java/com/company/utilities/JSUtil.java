package com.company.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.HttpURLConnection;
import java.net.URL;


public class JSUtil {
    public static Logger log= LogManager.getLogger(JSUtil.class.getName());


    public static void flashElement(WebElement element, WebDriver driver) {
        String bgColor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 8; i++) {
            changeColor("#000000", element, driver);
            changeColor(bgColor, element, driver);
        }
    }

    private static void changeColor(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
        }
    }

    public static void drawBorder(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    public static String getTitleByJS() {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        String title = js.executeScript("return document.title;").toString();
        return title;
    }

    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public static void generateJSAlert(String message) {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("alert('" + message + "')");
    }

    public static void refreshPageByJS() {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("history.go(0)");
    }
    public static void pageLoadComplete() {
        JavascriptExecutor js = (JavascriptExecutor) DriverUtil.getDriver();
        js.executeScript("return document.readyState").equals("complete");
    }

    public static void verifyLinkActive(String linkUrl)
    {
        try
        {
            URL url = new URL(linkUrl);

            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();

            httpURLConnect.setConnectTimeout(3000);

            httpURLConnect.connect();
//            if(linkUrl == null || linkUrl.isEmpty()){
//                System.out.println("URL is either not configured for anchor tag or it is empty");
//            }

            if(httpURLConnect.getResponseMessage()==null){
                log.fatal(url+"URL is either not configured for anchor tag or it is empty");

            }
            if(httpURLConnect.getResponseCode() >= 400){
                System.out.println(url+" is a broken link"+" "+httpURLConnect.getResponseCode());
            }
            else{
                System.out.println(url+" is a valid link"+" "+httpURLConnect.getResponseCode());
            }
            if(httpURLConnect.getResponseCode() >= 400){
                log.error(url+" is a broken link"+" "+httpURLConnect.getResponseCode());
            }

            if(httpURLConnect.getResponseCode()==200)
            {
                log.info(linkUrl+" - "+httpURLConnect.getResponseMessage()+" "+httpURLConnect.getResponseCode());
            }
            if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
            {
                log.error(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND  +" "+httpURLConnect.getResponseCode());
            }
        } catch (Exception e) {

        }
    }
}
