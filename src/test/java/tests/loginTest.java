package tests;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.loginPage;

public class loginTest extends baseTest{
    @BeforeMethod
    public void logout(){

        try {
            home.logoutBtn().click();
        } catch (NoSuchElementException e) {
            System.out.println("not logged in");

        }

    }
    @Test(dataProvider = "loginData")
    public void loginTest(String email,String password){
        loginPage page = home.clickSignInBtn();
        page.addEmail(email);
        page.addPass(password);
        page.signinBtn();
        try {
            Assert.assertEquals("basma hassan", home.getName(), "error signing in");
        }
        catch (NoSuchElementException e){
           Assert.assertEquals(page.getErrorMsg(),"Authentication failed.","wrong message");
        }
    }
    @DataProvider(name = "loginData")
    public Object[][] loginInfo(){
        return new Object[][]{{"abcd1@exampl.com","123456"},{"abxc@exampl.com","123456"},{"abc@exampl.com","1234x56"},{"abxc@exampl.com","123x456"}};
    }
}
