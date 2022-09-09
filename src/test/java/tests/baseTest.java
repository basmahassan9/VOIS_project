package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.homePage;

import java.util.concurrent.TimeUnit;

public class baseTest {
    public WebDriver driver;
    public homePage home;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        home = new homePage(driver);

    }

    @BeforeMethod
    public void goHome(){
        driver.get("http://automationpractice.com/index.php");
    }


    @AfterClass
    public void closeDriver(){
        driver.quit();

    }

}
