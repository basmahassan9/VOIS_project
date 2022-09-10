package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {
    private WebDriver driver;
    public checkoutPage(WebDriver driver){
        this.driver = driver;
    }
    public String getTitle(){
        return driver.findElement(By.id("cart_title")).getText();
    }
    public addressCheckoutPage proceedToCheckoutBtnClick(){
        driver.findElements(By.xpath("//a[@title=\"Proceed to checkout\"]")).get(1).click();
        return new addressCheckoutPage(driver);
    }
}
