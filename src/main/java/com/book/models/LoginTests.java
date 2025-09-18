package com.book.models;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTests extends TestBase{

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void loginPositiveTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User().setEmail("Tester1235321@gmail.com").setPassword("123456"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isSignOutElementPresent());
    }

    @Test
    public void loginNegativeTest(){    //            <-------------Уточнить  --------------------  DONE!!!!!!
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm( new User().setPassword("123456"));
        app.getUser().clickOnLoginButton();
        app.getUser().getValidationErrorText();
    }

    public boolean isErrorMessagePresent() {
        app.getUser().isElementPresent(By.cssSelector(".validation-summary-errors"));
        return false;
    }
}
