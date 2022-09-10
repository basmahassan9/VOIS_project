package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
   public WebElement getUserBtn(){
       return driver.findElement(By.xpath("//div[@class=\"header_user_info\"]//span"));
   }
   public String getName(){
        return getUserBtn().getText();
   }
   public blousesPage blouseBtnClick(){
       Actions action = new Actions(driver);
       action.moveToElement(driver.findElement(By.xpath("//a[@title=\"Women\"]"))).perform();
       driver.findElement(By.xpath("//a[@title=\"Blouses\"]")).click();
       return new blousesPage(driver);
   }
   public myAccountPage userBtnClick(){
        getUserBtn().click();
        return new myAccountPage(driver);
   }
    public WebElement logoutBtn(){
        return driver.findElement(By.className("logout"));
    }


}
