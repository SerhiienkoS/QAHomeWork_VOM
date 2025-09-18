package com.book.tests;

import com.book.models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTests extends TestBase{

    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod
    public void ensurePrecondition(){
        if(app.getUser().isLogOutPresent()){
            app.getUser().clickOnSignOutButton();
        }
    }

    @Test(priority = 1)
    public void loginPositiveTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User().setEmail("Tester1235321@gmail.com").setPassword("123456"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isSignOutElementPresent());
    }

    @Test(priority = 2)
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
