package com.book.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @Test
    public void loginPositivetest(){
        click(By.cssSelector(".ico-login"));
        type(By.name("Email"), "Tester1234321@gmail.com");
        type(By.name("Password"), "123456");
        click(By.cssSelector("input[value='Log in']"));
        Assert.assertTrue(isElementPresent(By.cssSelector("a.ico-logout")));
    }
}
