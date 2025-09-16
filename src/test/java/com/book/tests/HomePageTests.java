package com.book.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {
    @Test
    public void isHomeComponentPresentTest(){
        //driver.findElement(By.xpath("//div[@class='header-logo']"));
        //System.out.println("Home Component " + isHomeComponentPresent());
        Assert.assertTrue(isHomeComponentPresent());
    }
}


