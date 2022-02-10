package Pages;

import org.openqa.selenium.WebDriver;

public class Pagee {
    WebDriver driver;
    private LoginPage loginPage;
    private HomePageStdUser homePage;
    private CartPage cartPage;

    public Pagee(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public HomePageStdUser getHomePage() {
        if(homePage == null){
            homePage = new HomePageStdUser(driver);
        }
        return homePage;
    }
    public CartPage getCartPage(){
        if(cartPage == null){
            cartPage = new CartPage(driver);
        }
        return cartPage;
    }
}
