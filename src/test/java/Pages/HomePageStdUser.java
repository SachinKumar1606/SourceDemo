package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageStdUser {
    WebDriver driver;
    By bagPack = By.partialLinkText("Sauce Labs Backpack");
    By bikeLight = By.partialLinkText("Sauce Labs Bike Light");
    By tShirt = By.partialLinkText("Sauce Labs Bolt T-Shirt");
    By jacket = By.partialLinkText("Sauce Labs Fleece Jacket");
    By onesie = By.partialLinkText("Sauce Labs Onesie");
    By tRed = By.partialLinkText("Test.allTheThings() T-Shirt (Red)");
    By twitter = By.partialLinkText("Twitter");
    By facebook = By.partialLinkText("Facebook");
    By linkedIn = By.partialLinkText("LinkedIn");
    By cart = By.className("shopping_cart_link");
    By menu = By.id("react-burger-menu-btn");
    By allItem = By.partialLinkText("All Items");
    By logout = By.partialLinkText("Logout");
    By resetApp = By.partialLinkText("Reset App State");
    public HomePageStdUser(WebDriver driver){
        this.driver = driver;
    }
    public void logout(){
        driver.findElement(menu).click();
        driver.findElement(logout).click();
    }
}
