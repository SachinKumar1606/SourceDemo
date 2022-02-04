package Test;

import Pages.HomePageStdUser;
import org.testng.annotations.Test;

public class VerifyHomePage extends Base {

    @Test
    public void Test1(){
        Base.LoginStdUser();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink(){
        HomePageStdUser.setBagPack();
    }
}
