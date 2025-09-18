package com.book.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AplicationManager{
    String browser;
    public WebDriver driver;
    UserHelper user;
    HomePageHelper home;
    AddToCartHelper addToCart;

    public AplicationManager(String browser) {
        this.browser=browser;
    }


    public void init() {
        // было: if (driver.equals("chrome")) {
        if ("chrome".equalsIgnoreCase(browser)) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        // было: driver = new ChromeDriver();  // удалить эту строку

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
