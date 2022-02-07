package Pages;

import Resources.Xls_Reader;
import org.openqa.selenium.WebDriver;

public class Pagee {
    WebDriver driver;
    private LoginPage loginPage;
    private HomePageStdUser homePage;
    private Xls_Reader excel;
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
    public Xls_Reader reader(){
        String path = "C:\\Users\\SachinKumar\\Documents\\Sachin Kumar\\Projects\\SourceDemo\\TestData\\Login.xls";
        System.out.println(path);
        if(excel == null){
            excel = new Xls_Reader(path);
        }
        return excel;
    }
}
