package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;

    @FindBy (id="user-name")
    private WebElement username;
    @FindBy (id="password")
    private
    WebElement password;
    @FindBy (id="login-button")
    private
    WebElement submit;


    public LoginPage(WebDriver driver) {
       this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    public void LoginStdUser(){
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        submit.click();
        String act = driver.getCurrentUrl();
        String exp = "https://www.saucedemo.com/inventory.html";
        //driver.close();
        Assert.assertEquals(act,exp);
    }

}
