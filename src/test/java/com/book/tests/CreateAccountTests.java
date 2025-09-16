package com.book.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @Test(enabled = false)
    public void NewUserRegistrationPositiveTest() {

        int i = (int) ((System.currentTimeMillis() / 1000) % 3600);

        click(By.xpath("//a[@class='ico-register' or @href='/register']"));

        type(By.name("FirstName"), "Marko");

        type(By.name("LastName"), "Polo");

        type(By.name("Email"), "Tester1234321" + i + "@gmail.com");

        type(By.name("Password"), "123456");

        type(By.name("ConfirmPassword"), "123456");

        click(By.name("register-button"));

        Assert.assertTrue(isElementPresent(By.cssSelector("a.ico-logout")));
    }

    @Test
    public void ExistedUserRegistrationNegativeTest() {
        click(By.xpath("//a[@class='ico-register' or @href='/register']"));

        type(By.name("FirstName"), "Marko");

        type(By.name("LastName"), "Polo");

        type(By.name("Email"), "Tester1234321@gmail.com");

        type(By.name("Password"), "123456");

        type(By.name("ConfirmPassword"), "123456");

        click(By.name("register-button"));

        Assert.assertTrue(isAlertDisplayed());

    }

}
