package com.book.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        if(app.getUser().isLogOutPresent()){
            app.getUser().clickOnSignOutButton();
        }
    }
    @Test
    public void isHomeComponentPresentTest(){
        //driver.findElement(By.xpath("//div[@class='header-logo']"));
        //System.out.println("Home Component " + isHomeComponentPresent());
        Assert.assertTrue(app.getHome().isHomeComponentPresent());
    }
}


