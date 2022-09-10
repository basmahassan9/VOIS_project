package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class blousesPage {
    private WebDriver driver;
    public blousesPage(WebDriver driver){
        this.driver = driver;
    }
    public String getSubCatTitle(){
        return driver.findElement(By.cssSelector("h1.page-heading.product-listing span.cat-name")).getText();
    }
    public void addToCart(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector("div.left-block div.product-image-container"))).perform();
        driver.findElement(By.xpath("//a[@title=\"Add to cart\"]")).click();
    }
    public WebElement textResult(){
       return driver.findElement(By.cssSelector("div.layer_cart_product h2"));
    }
    public String getResultText(){
        return textResult().getText();
    }
    public checkoutPage checkoutBtnClick(){
        driver.findElement(By.cssSelector("div.button-container a.btn.btn-default.button.button-medium")).click();
        return new checkoutPage(driver);
    }
}
