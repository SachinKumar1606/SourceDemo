package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.Set;

import static java.time.Duration.*;

public class HomePageStdUser {

    public static WebDriver driver;
    //xpaths of links
    public static By bagPack = By.partialLinkText("Sauce Labs Backpack");
    public static By bikeLight = By.partialLinkText("Sauce Labs Bike Light");
    public static By tShirt = By.partialLinkText("Sauce Labs Bolt T-Shirt");
    public static By jacket = By.partialLinkText("Sauce Labs Fleece Jacket");
    public static By onesie = By.partialLinkText("Sauce Labs Onesie");
    public static By tRed = By.partialLinkText("Test.allTheThings() T-Shirt (Red)");
    //xpath of social media sites
    public static By twitter = By.partialLinkText("Twitter");
    public static By facebook = By.partialLinkText("Facebook");
    public static By linkedIn = By.partialLinkText("LinkedIn");
    //xpath of cart
    public static By cart = By.className("shopping_cart_link");
    //xpath of menu buton and there links
    public static By menu = By.id("react-burger-menu-btn");
    public static By allItem = By.partialLinkText("All Items");
    public static By logout = By.id("logout_sidebar_link");
    public static By resetApp = By.partialLinkText("Reset App State");
    //xpath of images
    public static By bagPackPic = By.id("item_4_img_link");
    public static By bikeLightPic = By.id("item_0_img_link");
    public static By tShirtPic = By.id("item_1_img_link");
    public static By jacketPic = By.id("item_5_img_link");
    public static By onesiePic = By.id("item_2_img_link");
    public static By tRedPic = By.id("item_3_title_link");

    //xpath add to cart
    public static By bagPackCart = By.id("add-to-cart-sauce-labs-backpack");
    public static By bikeLightCart = By.id("add-to-cart-sauce-labs-bike-light");
    public static By tShirtCart = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    public static By jacketCart = By.id("add-to-cart-sauce-labs-fleece-jacket");
    public static By onesieCart = By.id("add-to-cart-sauce-labs-onesie");
    public static By tRedCart = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    //xpath add to cartRemove
    public static By bagPackRemove = By.id("remove-sauce-labs-backpack");
    public static By bikeLightRemove = By.id("remove-sauce-labs-bike-light");
    public static By tShirtRemove = By.id("remove-sauce-labs-bolt-t-shirt");
    public static By jacketRemove = By.id("remove-sauce-labs-fleece-jacket");
    public static By onesieRemove = By.id("remove-sauce-labs-onesie");
    public static By tRedRemove = By.id("remove-test.allthethings()-t-shirt-(red)");

    public HomePageStdUser(WebDriver driver){
        this.driver = driver;
    }

    static SoftAssert soft = new SoftAssert();

    //Link check

    public static void setBagPack(){
        driver.findElement(bagPack).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=4";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setBikeLight(){
        driver.findElement(bikeLight).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=0";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void settShirt(){
        driver.findElement(tShirt).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=1";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setJacket(){
        driver.findElement(jacket).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=5";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void settRed(){
        driver.findElement(tRed).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=3";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setOnesie(){
        driver.findElement(onesie).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=2";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setLogout(){
        driver.findElement(menu).click();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        driver.findElement(logout).click();
    }

    public static void setBagPackPic(){
        driver.findElement(bagPackPic).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=4";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setBikeLightPic(){
        driver.findElement(bikeLightPic).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=0";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void settShirtPic(){
        driver.findElement(tShirtPic).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=1";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setJacketPic(){
        driver.findElement(jacketPic).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=5";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void settRedPic(){
        driver.findElement(tRedPic).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=3";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setOnesiePic(){
        driver.findElement(onesiePic).click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=2";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setBagPackCart(){
        driver.findElement(bagPackCart).click();
        String act = driver.findElement(bagPackRemove).getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setBikeLightCart(){
        driver.findElement(bikeLightCart).click();
        String act = driver.findElement(bikeLightRemove).getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void settShirtCart(){
        driver.findElement(tShirtCart).click();
        String act = driver.findElement(tShirtRemove).getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setJacketCart(){
        driver.findElement(jacketCart).click();
        String act = driver.findElement(jacketRemove).getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void settRedCart(){
        driver.findElement(tRedCart).click();
        String act = driver.findElement(tRedRemove).getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setOnesieCart(){
        driver.findElement(onesieCart).click();
        String act = driver.findElement(onesieRemove).getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public static void setTwitter(){
        driver.findElement(twitter).click();
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                String act = driver.switchTo().window(child_window).getCurrentUrl();
                driver.switchTo().window(parent);
            }
        }
        String exp = "https://twitter.com/saucelabs";
    }

    public static void setFacebook(){
        driver.findElement(facebook).click();
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                String act = driver.switchTo().window(child_window).getCurrentUrl();
                driver.switchTo().window(parent);
            }
        }
        String exp = "https://www.facebook.com/saucelabs";
    }

    public static void setLinkedIn(){
        driver.findElement(linkedIn).click();
        String parent=driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1= s.iterator();
        while(I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                String act = driver.switchTo().window(child_window).getCurrentUrl();
                driver.switchTo().window(parent);
            }
        }
        String exp = "https://www.linkedin.com/authwall?trk=bf&trkInfo=AQFaF9jmTwbCUgAAAX7TN0HoZALrI1YlE0KkFrNB9zvuqqKq"
        +"TgJ4mrpT5zpciyS45Nl8pFomH2Fpnk0meb5bSB4r24HZlqyqkOcRH7fkJDTRtIr9Pv52VjNwsBbJQinIcz-Wmxc=&originalReferer=&"
        +"sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fsauce-labs%2F";
    }
}
