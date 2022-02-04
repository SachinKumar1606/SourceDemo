package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

    static WebDriver driver;

    static By username = By.id("user-name");
    static By password = By.id("password");
    static By submit = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public static void typeUsername(){
        driver.findElement(username).sendKeys("standard_user");
    }

    public static void typePassword(){
        driver.findElement(password).sendKeys("secret_sauce");
    }

    public static void clickSubmit(){
        driver.findElement(submit).click();
    }
}
