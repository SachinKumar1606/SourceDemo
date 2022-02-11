package Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckOutPage {
    WebDriver driver;

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
    @FindBy(className = "shopping_cart_link")
    WebElement cart;

    @FindBy(id = "first-name")
    private WebElement fName;
    @FindBy(id = "last-name")
    private WebElement lName;
    @FindBy(id = "postal-code")
    private WebElement postCode;

    @FindBy(id = "cancel")
    private WebElement cancel;
    @FindBy(id = "continue")
    private WebElement shop;

    //Locators of social media sites
    @FindBy(partialLinkText="Twitter")
    private WebElement twitter;
    @FindBy(partialLinkText="Facebook")
    private WebElement facebook;
    @FindBy(partialLinkText="LinkedIn")
    private WebElement linkedIn;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setfName(String name){
        fName.sendKeys(name);
    }

    public void setlName(String pass){
        lName.sendKeys(pass);
    }

    public void setPostCode(String pin){
        postCode.sendKeys(pin);
    }
}
