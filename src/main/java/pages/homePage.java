package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {
    private WebDriver driver;
    public homePage(WebDriver driver){
        this.driver =driver;
    }
   public loginPage clickSignInBtn(){
        driver.findElement(By.className("login")).click();
        return new loginPage(driver);
   }

}
