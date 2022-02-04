package Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Base {

    @Test
    public void LoginStdUser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        LoginPage page = new LoginPage(driver);
        driver.navigate().to("https://www.saucedemo.com/");
        page.typeUsername();
        page.typePassword();
        page.clickSubmit();
        String act = driver.getCurrentUrl();
        String exp = "https://www.saucedemo.com/inventory.html";
        driver.close();
        Assert.assertEquals(act,exp);
    }

}
