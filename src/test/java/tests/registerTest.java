package tests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.loginPage;
import pages.registerPage;

public class registerTest extends baseTest {
    @BeforeMethod
    public void logout(){

       try {
            home.logoutBtn().click();
        } catch (NoSuchElementException e) {
           System.out.println("not logged in");

       }

    }
    @Test(dataProvider = "registerData")
    public void signUpValidMail(String mail, String firstName,String lastName, String password){
        loginPage login = home.clickSignInBtn();
        login.createEmail(mail);
        registerPage page = login.createAccountBtn();

        page.firstNameAdd(firstName);
        page.lastNameAdd(lastName);
        page.chooseTitle("1");
        page.passAdd(password);
        page.dateOfBirthAdd("1","2","1996");
        page.companyAdd("abc");
        page.addressAdd("abc");
        page.cityAdd("abc");
        page.countryAdd("United States");
        page.stateAdd("Alabama");
        page.postcodeAdd("12345");
        page.phoneAdd("0123456");
        page.mobileAdd("4512387");
        page.submitBtn();

        Assert.assertEquals(firstName+" "+ lastName , home.getName(),"error signing in");
    }
    @Test(dataProvider = "registerData")
    public void signUpInvalidMail(String mail, String firstName,String lastName, String password){
        loginPage login = home.clickSignInBtn();
        login.createEmail(mail);
        registerPage page = login.createAccountBtn();


        Assert.assertEquals(login.getInvalidMailMsg(),"Invalid email address.","wrong message");
    }
    @Test(dataProvider = "registerData")
    public void signUpRegisteredMail(String mail, String firstName,String lastName, String password){
        loginPage login = home.clickSignInBtn();
        login.createEmail(mail);
        registerPage page = login.createAccountBtn();

        Assert.assertEquals(login.getInvalidMailMsg(),"An account using this email address has already been registered. Please enter a valid password or request a new one.","wrong message");
    }
    @Test(dataProvider = "registerData")
    public void signUpInvalidData(String mail, String firstName,String lastName, String password){
        loginPage login = home.clickSignInBtn();
        login.createEmail(mail);
        registerPage page = login.createAccountBtn();

        page.firstNameAdd(firstName);
        page.lastNameAdd(lastName);
        page.chooseTitle("1");
        page.passAdd(password);
        page.dateOfBirthAdd("1","2","1996");
        page.companyAdd("abc");
        page.addressAdd("abc");
        page.cityAdd("abc");
        page.countryAdd("United States");
        page.stateAdd("Alabama");
        page.postcodeAdd("12345");
        page.phoneAdd("0123456");
        page.mobileAdd("4512387");
        page.submitBtn();

        Assert.assertEquals("firstname is invalid.", page.getErrorMsg(),"wrong message");
    }
    @Test(dataProvider = "registerData")
    public void signUpMissingData(String mail, String firstName,String lastName, String password){
        loginPage login = home.clickSignInBtn();
        login.createEmail(mail);
        registerPage page = login.createAccountBtn();

        page.firstNameAdd(firstName);
        page.lastNameAdd(lastName);
        page.chooseTitle("1");
        page.passAdd(password);
        page.dateOfBirthAdd("1","2","1996");
        page.companyAdd("abc");
        page.addressAdd("abc");
        page.cityAdd("abc");
        page.countryAdd("United States");
        page.stateAdd("Alabama");
        page.postcodeAdd("12345");
        page.phoneAdd("0123456");
        page.mobileAdd("4512387");
        page.submitBtn();

        Assert.assertEquals("firstname is required.", page.getErrorMsg(),"wrong message");
    }
    @DataProvider(name = "registerData")
    public Object[][] registerInfo(){
        int randomNum = (int)(Math.random() * 101);
        return new Object[][]{{"abcd"+randomNum+"@example.com","basma","hassan","123456"},{"abcd23@exampl.com",".@123fd","hassan","123456"},{"abc","basma","hassan","123456"},{"abc@exampl.com","basma","hassan","123456"},{"abc2@exampl.com","","hassan","123456"}};
    }



}
