package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addressCheckoutPage {
    private WebDriver driver;
    public addressCheckoutPage(WebDriver driver){
        this.driver = driver;
    }
    public shippingCheckoutPage proceedToCheckoutBtn(){
        driver.findElement(By.cssSelector("p.cart_navigation.clearfix button")).click();
        return new shippingCheckoutPage(driver);
    }
}
