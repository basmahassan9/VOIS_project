package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class shippingCheckoutPage {
    private WebDriver driver;
    public shippingCheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void termsOfServiceBtn(){
        driver.findElement(By.id("cgv")).click();
    }
    public paymentCheckoutPage proceedToCheckoutBtn(){

        driver.findElement(By.cssSelector("p.cart_navigation.clearfix button")).click();
        return new paymentCheckoutPage(driver);
    }
}
