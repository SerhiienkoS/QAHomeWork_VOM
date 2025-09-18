package com.book.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {

        //int i = (int) ((System.currentTimeMillis() / 1000) % 3600);

        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm("Marko", "Polo", "Tester1236321@gmail.com", "123456", "123456");
        app.getUser().clicOnRegistrationButton();
        Assert.assertTrue(app.getUser().isSignOutElementPresent());
    }

    @Test
    public void existedUserRegistrationNegativeTest() {
        app.getUser().clickOnRegisterLink();
        app.getUser().fillRegisterForm("Marko", "Polo", "Tester1235321@gmail.com", "123456", "123456");
        app.getUser().clicOnRegistrationButton();
    }
}
