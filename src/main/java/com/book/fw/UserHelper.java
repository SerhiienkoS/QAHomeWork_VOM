package com.book.fw;

import com.book.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper{
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clicOnRegistrationButton() {
        click(By.name("register-button"));
    }

    public void fillRegisterForm(String firstName, String lastName, String email, String password, String confirmPassword) {
        type(By.name("FirstName"), firstName);

        type(By.name("LastName"), lastName);

        fillLoginForm(new User().setEmail("Tester1235321@gmail.com").setPassword("123456"));

        type(By.name("ConfirmPassword"), confirmPassword);
    }

    public void clickOnRegisterLink() {
        click(By.xpath("//a[@class='ico-register' or @href='/register']"));
    }

    public void clickOnLoginButton() {
        click(By.cssSelector("input[value='Log in']"));
    }

    public void fillLoginForm(User user) {
        type(By.name("Email"), user.getEmail());
        type(By.name("Password"), user.getPassword());
    }

    public void clickOnLoginLink() {
        click(By.cssSelector(".ico-login"));
    }
    public boolean isSignOutElementPresent() {
        return isElementPresent(By.cssSelector("a.ico-logout"));
    }

    public boolean isLogOutPresent() {
        return isElementPresent(By.cssSelector("a.ico-logout"));
    }

    public void clickOnSignOutButton() {
         click(By.cssSelector("a.ico-logout"));
    }
}
