package com.book.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AplicationManager{
    WebDriver driver;
    UserHelper user;
    HomePageHelper home;
    AddToCartHelper addToCart;


    public void init() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        user = new UserHelper(driver);
        home = new HomePageHelper(driver);
        addToCart = new AddToCartHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public UserHelper getUser() {
        return user;
    }

    public HomePageHelper getHome() {
        return home;
    }

    public AddToCartHelper getAddToCart() {
        return addToCart;
    }
}
