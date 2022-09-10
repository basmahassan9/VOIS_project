package tests;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class checkoutTest extends baseTest{
    @BeforeClass
    public void login(){
        loginPage page = home.clickSignInBtn();
        page.addEmail("abc@exampl.com");
        page.addPass("123456");
        page.signinBtn();
    }
    @Test
    public void BlouseTest() {
        blousesPage page = home.blouseBtnClick();
        Assert.assertEquals(page.getSubCatTitle(),"BLOUSES ","wrong text");

    }

    @Test
    public void addToCartTest(){
        blousesPage page = home.blouseBtnClick();
        page.addToCart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page.textResult()));
        Assert.assertEquals(page.getResultText(),"Product successfully added to your shopping cart","wrong text");
    }
    @Test
    public void checkoutTest(){
        blousesPage page = home.blouseBtnClick();
        page.addToCart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page.textResult()));
        checkoutPage checkoutPage = page.checkoutBtnClick();
        Assert.assertTrue(checkoutPage.getTitle().contains("SHOPPING-CART SUMMARY"),"wrong text");

    }
    @Test
    public void proceedToCheckoutTest(){
        blousesPage page = home.blouseBtnClick();
        page.addToCart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page.textResult()));
        checkoutPage checkoutPage = page.checkoutBtnClick();
        shippingCheckoutPage shPage = checkoutPage.proceedToCheckoutBtnClick().proceedToCheckoutBtn();
        shPage.termsOfServiceBtn();
        orderConfirmationPage orderPage = shPage.proceedToCheckoutBtn().bankWireSelect().proceedToCheckoutBtn();
        String resultText = orderPage.getConfirmationText();
        orderRef = orderPage.getOrderReferenceText().split("reference")[1].split(" ")[1];
        System.out.println(orderRef);
        Assert.assertEquals("Your order on My Store is complete.",resultText,"wrong output");

    }
    public String orderRef;
    @Test
    public void validateOrderTest(){
        myAccountPage page = home.userBtnClick();
        orderHistoryPage historyPage = page.orderHistoryBtnClick();
        Assert.assertEquals(historyPage.getOrderReference(),orderRef,"wrong order");
    }

    }

