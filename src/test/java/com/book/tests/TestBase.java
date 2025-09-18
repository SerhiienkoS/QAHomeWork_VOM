package com.book.tests;

import com.book.fw.AplicationManager;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static AplicationManager app = new AplicationManager(System.getProperty("browser",
            Browser.CHROME.browserName()));

    @BeforeSuite
    //@BeforeMethod
    public void setUp(){
        app.init();
    }

    @AfterSuite
    //@AfterMethod(enabled = false)
    public void tearDown(){
        app.stop();
    }

    //    public boolean isAlertDisplayed() {
//        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(20))
//                .until(ExpectedConditions.alertIsPresent());
//        if (alert == null) {
//            return false;
//        } else {
//            alert.getText(By.cssSelector(".validation-summary-errors"));
//            return true;
//        }
//    }

}
