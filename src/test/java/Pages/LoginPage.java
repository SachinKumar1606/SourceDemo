package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = By.id("user-name");
    By password = By.id("password");
    By submit = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void typeUsername(){
        driver.findElement(username).sendKeys("standard_user");
    }

    public void typePassword(){
        driver.findElement(password).sendKeys("secret_sauce");
    }

    public void clickSubmit(){
        driver.findElement(submit).click();
    }
}
