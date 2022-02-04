package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import static java.time.Duration.*;

public class HomePageStdUser {
    public static WebDriver driver;
    public static By bagPack = By.partialLinkText("Sauce Labs Backpack");
    public static By bikeLight = By.partialLinkText("Sauce Labs Bike Light");
    public static By tShirt = By.partialLinkText("Sauce Labs Bolt T-Shirt");
    public static By jacket = By.partialLinkText("Sauce Labs Fleece Jacket");
    public static By onesie = By.partialLinkText("Sauce Labs Onesie");
    public static By tRed = By.partialLinkText("Test.allTheThings() T-Shirt (Red)");
    public static By twitter = By.partialLinkText("Twitter");
    public static By facebook = By.partialLinkText("Facebook");
    public static By linkedIn = By.partialLinkText("LinkedIn");
    public static By cart = By.className("shopping_cart_link");
    public static By menu = By.id("react-burger-menu-btn");
    public static By allItem = By.partialLinkText("All Items");
    public static By logout = By.id("logout_sidebar_link");
    public static By resetApp = By.partialLinkText("Reset App State");

    public HomePageStdUser(WebDriver driver){
        this.driver = driver;
    }

    static SoftAssert soft = new SoftAssert();

    public static void setBagPack(){
        driver.findElement(bagPack).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=4";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }


    public static void setLogout() throws InterruptedException {
        driver.findElement(menu).click();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        driver.findElement(logout).click();
    }

}
