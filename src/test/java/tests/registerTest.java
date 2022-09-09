package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.loginPage;
import pages.registerPage;

public class registerTest extends baseTest {
    @Test
    public void registerTests(){
        loginPage login = home.clickSignInBtn();
        login.createEmail("ab@exampl.com");
        registerPage page = login.createAccountBtn();

        page.firstNameAdd("as");
        page.lastNameAdd("kl");
        page.chooseTitle("1");
        page.passAdd("123456");
        page.dateOfBirthAdd("1","2","1996");
        page.companyAdd("ji");
        page.addressAdd("jfg");
        page.cityAdd("eyg");
        page.countryAdd("United States");
        page.stateAdd("Alabama");
        page.postcodeAdd("12345");
        page.phoneAdd("0123456");
        page.mobileAdd("4512387");
        page.submitBtn();

        Assert.assertEquals("as kl" , home.getName(),"error signing in");
    }
}
