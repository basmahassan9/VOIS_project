package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class blousesPage {
    private WebDriver driver;
    public blousesPage(WebDriver driver){
        this.driver = driver;
    }
    public void addToCart(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("div.left-block div.product-image-container"))).perform();
        driver.findElement(By.xpath("//a[@title=\"Add to cart\"]")).click();
    }
    public String getResultText(){
        return driver.findElement(By.cssSelector("div.layer_cart_product h2")).getText();
    }
}
