package com.book.tests;

import com.book.models.User;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        app.clickOnLoginLink();
        app.fillLoginForm(new User().setEmail("Tester1235321@gmail.com").setPassword("123456"));
        app.clickOnLoginButton();
    }
    @Test
    public void addProductToCartTest(){
        app.clickOnBooksButtonInHeader();
        app.clickAddProductButton(); // это добовление 1 продукта из списка (кнопка Add пренадлежит 1 продукту в списке)
        app.clickOnCartIcon();

    }

}