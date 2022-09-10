package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bankWirePage {
    private WebDriver driver;
    public bankWirePage(WebDriver driver){
        this.driver = driver;
    }
    public orderConfirmationPage proceedToCheckoutBtn(){
        driver.findElement(By.cssSelector("p.cart_navigation.clearfix button")).click();
        return new orderConfirmationPage(driver);
    }
}
