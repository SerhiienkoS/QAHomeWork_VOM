package com.book.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartHelper extends BaseHelper{
    public AddToCartHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnCartIcon() {
        click(By.cssSelector(".header-links #topcartlink a.ico-cart"));
    }

    public void clickAddProductButton() {
        click(By.cssSelector( (".product-grid .product-item[data-productid='13'] .buttons input.product-box-add-to-cart-button")));
    }

    public void clickOnBooksButtonInHeader() {
        click(By.cssSelector(".header-menu .top-menu > li > a[href='/books']"));
    }

    public void clickUpdateCartButton() {
        click(By.cssSelector("input[value='Update shopping cart']"));
    }

    public void clearNumberOfItemsInCArt() {
        type(By.cssSelector("table.cart input[name^='itemquantity']"), "0");
    }
}
