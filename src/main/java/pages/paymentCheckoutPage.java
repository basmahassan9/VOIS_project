package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class paymentCheckoutPage {
    private WebDriver driver;
    public paymentCheckoutPage(WebDriver driver){
        this.driver = driver;
    }
    public bankWirePage bankWireSelect(){
        driver.findElement(By.className("bankwire")).click();
        return  new bankWirePage(driver);
    }
}
