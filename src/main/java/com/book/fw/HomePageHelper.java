package com.book.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends BaseHelper{
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isHomeComponentPresent(){
        return isElementPresent(By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
    }

    public void clickOnHomeLink() {
        click(By.xpath("img[alt='Tricentis Demo Web Shop']"));
    }
}
