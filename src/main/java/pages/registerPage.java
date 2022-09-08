package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class registerPage {
    private WebDriver driver;
    public registerPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index 1 for Mr, 2 for Mrs
     */
    public void chooseTitle(String index){
        driver.findElement(By.id("id_gender"+index)).click();
    }
    public void firstNameAdd(String name){
        driver.findElement(By.id("customer_firstname")).sendKeys(name);
    }
    public void lastNameAdd(String name){
        driver.findElement(By.id("customer_lastname")).sendKeys(name);
    }
    public void emailAdd(String mail){
        driver.findElement(By.id("email")).sendKeys(mail);
    }
    public void passAdd(String pass){
        driver.findElement(By.id("passwd")).sendKeys(pass);
    }
    public void dateOfBirthAdd(String day,String month, String year){
        Select dayObj= new Select(driver.findElement(By.id("days")));
        dayObj.selectByValue(day);
        Select monthObj= new Select(driver.findElement(By.id("months")));
        monthObj.selectByValue(month);
        Select yearObj= new Select(driver.findElement(By.id("years")));
        yearObj.selectByValue(year);
    }
    public void companyAdd(String company){
        driver.findElement(By.id("company")).sendKeys(company);
    }
    public void addressAdd(String address){
        driver.findElement(By.id("address1")).sendKeys(address);
    }


}
