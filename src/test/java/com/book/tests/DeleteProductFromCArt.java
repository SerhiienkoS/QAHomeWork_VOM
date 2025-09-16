package com.book.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteProductFromCArt extends TestBase {
    @BeforeMethod
    public void precondition() {
        click(By.cssSelector(".ico-login"));
        type(By.name("Email"), "Tester1234321@gmail.com");
        type(By.name("Password"), "123456");
        click(By.cssSelector("input[value='Log in']"));
        click(By.cssSelector(".header-menu .top-menu > li > a[href='/books']"));
        click(By.cssSelector( (".product-grid .product-item[data-productid='13'] .buttons input.product-box-add-to-cart-button")));
        click(By.cssSelector(".header-links #topcartlink a.ico-cart"));
    }
    @Test
    public void deleteProductFromCart(){
        type(By.cssSelector("table.cart input[name^='itemquantity']"),"0");
        click(By.cssSelector("input[value='Update shopping cart']"));

    }
}
