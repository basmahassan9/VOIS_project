package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.loginPage;

public class loginTest extends baseTest{
    @Test
    public void loginTest(){
        loginPage page = home.clickSignInBtn();
        page.addEmail("ab@exampl.com");
        page.addPass("123456");
        page.signinBtn();

        Assert.assertEquals("as kl" , home.getName(),"error signing in");
    }
}
