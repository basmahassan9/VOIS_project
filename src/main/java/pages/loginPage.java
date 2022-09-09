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

    public void addEmail(String mail){
        driver.findElement(By.id("email")).sendKeys(mail);
    }
    public void addPass(String pass){
        driver.findElement(By.id("passwd")).sendKeys(pass);
    }
    public void signinBtn(){
        driver.findElement(By.id("SubmitLogin")).click();
    }

}
