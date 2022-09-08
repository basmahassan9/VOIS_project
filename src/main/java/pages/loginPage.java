package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;
    public loginPage(WebDriver driver){
        this.driver = driver;
    }
    public void createEmail(String mail){
        driver.findElement(By.id("email_create")).sendKeys(mail);
    }
    public registerPage createAccountBtn(){
        driver.findElement(By.id("SubmitCreate")).click();
        return new registerPage(driver);
    }

}
