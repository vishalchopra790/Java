package com.company.step_definitions;


import com.company.utilities.BrowserUtils;
import com.company.utilities.ConfigReader;
import com.company.utilities.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {

    private static Logger log = LogManager.getLogger(Hook.class.getName());
//    @Before("@Download")
//    public void beforeDownload() throws InterruptedException {
//       Vena v=new Vena();
//       v.user_must_land_on_login_page();
//       v.user_login_with_username_and_password();
//       v.user_land_into_home_page_and_confirm_user_navigated_to_right_url();
//    }

    @Before
    public void setup() {
        String browser = ConfigReader.getProperty("browser");
        if (!browser.contains("remote") && !browser.contains("mobile")) {
            DriverUtil.getDriver();
            log.info("Launching browser " + ConfigReader.getProperty("browser"));
            DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            BrowserUtils.getScreenshot(scenario.getName());
            byte[] screenshot = ((TakesScreenshot) DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
            //scenario.embed(screenshot, "image/png");
        }
        DriverUtil.closeDriver();
        log.info("browser closed");
    }
}