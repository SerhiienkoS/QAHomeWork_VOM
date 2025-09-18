//package com.book.tests;
//
//import com.book.models.User;
//import org.openqa.selenium.By;
//import org.testng.xml.Assert;
//import org.testng.xml.annotations.BeforeMethod;
//import org.testng.xml.annotations.Test;
//
//public class DeleteItemFromCartTest extends TestBase {
//    @BeforeMethod
//    public void precondition(String email, String password) {
////        if(app.getUser().isLogOutPresent()){
////            app.getUser().clickOnSignOutButton();
////        }
//        app.getUser().clickOnLoginLink();
//        app.getUser().fillLoginForm(new User().setEmail("Tester1235321@gmail.com").setPassword("123456"));
//        app.getUser().clickOnLoginButton();
//        app.getAddToCart().clickOnBooksButtonInHeader();
//        app.getAddToCart().clickAddProductButton(); // это добовление 1 продукта из списка (кнопка Add пренадлежит 1 продукту в списке)
//        app.getAddToCart().clickOnCartIcon();
//    }
//
//    @Test
//    public void deleteProductFromCart() {
//        int countProductsBefore = countOfProducts();
//        app.getAddToCart().clearNumberOfItemsInCArt();
//        app.getAddToCart().clickUpdateCartButton();
//        //pause(1000);
//        int countProductsAfter = countOfProducts();
//        Assert.assertEquals(countProductsAfter, countProductsBefore - 1);
//    }
//
//    public int countOfProducts() {
//        if (app.getAddToCart().isElementPresent(By.cssSelector("table.cart input[name^='itemquantity']"))) {
//            return app.driver.findElements(By.cssSelector("table.cart input[name^='itemquantity']")).size();
//        }
//        return 0;
//    }
//}
//
