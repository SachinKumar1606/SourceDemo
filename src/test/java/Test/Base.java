package Test;

import Pages.HomePageStdUser;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class Base {

    static WebDriver driver;

    @BeforeClass
    void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LoginPage page = new LoginPage(driver);
        HomePageStdUser hpage = new HomePageStdUser(driver);
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}






