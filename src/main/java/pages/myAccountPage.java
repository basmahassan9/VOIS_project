package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myAccountPage {
    private WebDriver driver;
    public myAccountPage(WebDriver driver){
        this.driver = driver;
    }
    public orderHistoryPage orderHistoryBtnClick(){
        driver.findElement(By.xpath("//ul[@class=\"myaccount-link-list\"]//a[@title=\"Orders\"]")).click();
        return new orderHistoryPage(driver);
    }
}
