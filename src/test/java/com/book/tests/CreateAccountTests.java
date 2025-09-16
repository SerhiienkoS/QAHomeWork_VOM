package com.book.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccountTests extends TestBase {
    @Test(enabled = false)
    public void NewUserRegistrationPositiveTest() {
        click(By.xpath("//a[@class='ico-register' or @href='/register']"));

        type(By.name("FirstName"), "Marko");

        type(By.name("LastName"), "Polo");

        type(By.name("Email"), "Tester1234321@gmail.com");

        type(By.name("Password"), "123456");

        type(By.name("ConfirmPassword"), "123456");

        click(By.name("register-button"));

        Assert.assertTrue(isElementPresent(By.cssSelector("a.ico-logout")));
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
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

    public boolean isAlertDisplayed() {
        Alert alert = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        } else {
            return true;
        }

    }
}
