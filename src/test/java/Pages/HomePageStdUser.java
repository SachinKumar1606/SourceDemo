package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.Set;

import static java.time.Duration.*;

public class HomePageStdUser {

    public static WebDriver driver;

    //Locators of links

    @FindBy(partialLinkText="Sauce Labs Backpack")
    private WebElement bagPack;
    @FindBy(partialLinkText="Sauce Labs Bike Light")
    private WebElement bikeLight;
    @FindBy(partialLinkText="Sauce Labs Bolt T-Shirt")
    private WebElement tShirt;
    @FindBy(partialLinkText="Sauce Labs Fleece Jacket")
    private WebElement jacket;
    @FindBy(partialLinkText="Sauce Labs Onesie")
    private WebElement onesie;
    @FindBy(partialLinkText="Test.allTheThings() T-Shirt (Red)")
    private WebElement tRed;

    //Locators of social media sites
    @FindBy(partialLinkText="Twitter")
    private WebElement twitter;
    @FindBy(partialLinkText="Facebook")
    private WebElement facebook;
    @FindBy(partialLinkText="LinkedIn")
    private WebElement linkedIn;

    //Locators of cart
    @FindBy(className = "shopping_cart_link")
    WebElement cart;

    //Locators of menu buton and there links
    @FindBy(id="react-burger-menu-btn")
    private WebElement menu;
    @FindBy(id="logout_sidebar_link")
    private WebElement allItem;
    @FindBy(id="logout_sidebar_link")
    private WebElement logout;
    @FindBy(partialLinkText = "Reset App State")
    private WebElement resetApp;

    //Locators of images
    @FindBy(id="item_4_img_link")
    private WebElement bagPackPic;
    @FindBy(id="item_0_img_link")
    private WebElement bikeLightPic;
    @FindBy(id="item_1_img_link")
    private WebElement tShirtPic;
    @FindBy(id="item_5_img_link")
    private WebElement jacketPic;
    @FindBy(id="item_2_img_link")
    private WebElement onesiePic;
    @FindBy(id="item_3_title_link")
    private WebElement jactRedPicketPic;

    //Locators add to cart

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    private WebElement bagPackCart;
    @FindBy(id="add-to-cart-sauce-labs-bike-light")
    private WebElement bikeLightCart;
    @FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement tShirtCart;
    @FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
    private WebElement jacketCart;
    @FindBy(id="add-to-cart-sauce-labs-onesie")
    private WebElement onesieCart;
    @FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement tRedCart;

    //Locators add to cartRemove

    @FindBy(id="remove-sauce-labs-backpack")
    private WebElement bagPackRemove;
    @FindBy(id="remove-sauce-labs-bike-light")
    private WebElement bikeLightRemove;
    @FindBy(id="remove-sauce-labs-bolt-t-shirt")
    private WebElement tShirtRemove;
    @FindBy(id="remove-sauce-labs-fleece-jacket")
    private WebElement jacketRemove;
    @FindBy(id="remove-sauce-labs-onesie")
    private WebElement onesieRemove;
    @FindBy(id="remove-test.allthethings()-t-shirt-(red)")
    private WebElement tRedRemove;

    public HomePageStdUser(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    static SoftAssert soft = new SoftAssert();

    //Link check

    public void setBagPack(){
        bagPack.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=4";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setBikeLight(){
        bikeLight.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=0";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settShirt(){
        tShirt.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=1";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setJacket(){
        jacket.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=5";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settRed(){
        tRed.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=3";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setOnesie(){
        onesie.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=2";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    //Logout method
    public void setLogout(){
        menu.click();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        logout.click();
    }

    //Picture check function
    public void setBagPackPic(){
        bagPackPic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=4";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setBikeLightPic(){
        bikeLightPic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=0";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settShirtPic(){
        tShirtPic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=1";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setJacketPic(){
        jacketPic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=5";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settRedPic(){
        jactRedPicketPic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=3";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setOnesiePic(){
        onesiePic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=2";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    //Add to cart function
    public void setBagPackCart(){
        bagPackCart.click();
        String act = bagPackRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setBikeLightCart(){
        bikeLightCart.click();
        String act =  bikeLightRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settShirtCart(){
        tShirtCart.click();
        String act = tShirtRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setJacketCart(){
        jacketCart.click();
        String act = jacketRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settRedCart(){
        tRedCart.click();
        String act = tRedRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setOnesieCart(){
        onesieCart.click();
        String act = onesieRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    //Link check if social media accounts.
    public void setTwitter(){
        twitter.click();
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

    public void setFacebook(){
        facebook.click();
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

    public void setLinkedIn(){
        linkedIn.click();
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
