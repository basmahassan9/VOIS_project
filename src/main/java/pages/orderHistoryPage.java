package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orderHistoryPage {
    private WebDriver driver;
    public orderHistoryPage(WebDriver driver){
        this.driver = driver;
    }
    public String getOrderReference(){
        return driver.findElement(By.cssSelector("tr.first_item td.history_link.bold.footable-first-column a")).getText();
    }
}
