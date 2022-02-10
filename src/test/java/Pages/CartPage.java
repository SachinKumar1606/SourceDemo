package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

public class CartPage {

    public static WebDriver driver;

    //Locators of menu button and there links
    @FindBy(id="react-burger-menu-btn")
    private WebElement menu;
    @FindBy(id="inventory_sidebar_link")
    private WebElement allItem;
    @FindBy(id="about_sidebar_link")
    private WebElement about;
    @FindBy(id="logout_sidebar_link")
    private WebElement logout;
    @FindBy(id = "reset_sidebar_link")
    private WebElement resetApp;
    @FindBy(id = "react-burger-cross-btn")
    private WebElement close;

    //Locators of item name
    @FindBy (className = "inventory_item_name")
    private WebElement pName;
    @FindBy (className = "cart_button")
    private WebElement remove;
    @FindBy (id = "continue-shopping")
    private WebElement home;

    @FindBy (id = "checkout")
    private WebElement checkout;

    //Locators of social media sites
    @FindBy(partialLinkText="Twitter")
    private WebElement twitter;
    @FindBy(partialLinkText="Facebook")
    private WebElement facebook;
    @FindBy(partialLinkText="LinkedIn")
    private WebElement linkedIn;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setHome(){
        home.click();
    }

    public void setLogout(){
        menu.click();
        logout.click();
    }

    public void setAllItem(){
        menu.click();
        allItem.click();
    }

    public void setAbout(){
        menu.click();
        about.click();
    }

    public void setpName(){
        pName.click();
    }

    public void setRemove(){
        remove.click();
    }

    public void setCheckout(){
        checkout.click();
    }

    public void setResetApp(){
        menu.click();
        resetApp.click();
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
