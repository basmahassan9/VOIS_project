package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class orderConfirmationPage {
    private WebDriver driver;
    public orderConfirmationPage(WebDriver driver){
        this.driver = driver;
    }
    public String getConfirmationText(){

        return driver.findElement(By.className("cheque-indent")).getText();
    }
    public String getOrderReferenceText(){
        String text = driver.findElement(By.cssSelector("div.box")).getText();
        System.out.println(text);
        return text;
    }
}
