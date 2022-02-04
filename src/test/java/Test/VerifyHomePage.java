package Test;

import Pages.HomePageStdUser;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class VerifyHomePage extends Base {

    @Test
    public void Test1(){
        LoginPage.LoginStdUser();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink(){
        HomePageStdUser.setBagPack();
    }
}
