package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.blousesPage;

public class categoryTest extends baseTest{
    @Test
    public void BlouseTest(){
        blousesPage page = home.blouseBtnClick();
        Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?id_category=7&controller=category");
    }
}
