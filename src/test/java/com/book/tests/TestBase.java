package com.book.tests;

import com.book.fw.AplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected AplicationManager app = new AplicationManager();

    @BeforeMethod
    public void setUp(){
        app.init();
    }

    @AfterMethod(enabled = false)
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
