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
    public void checkLink1(){
        HomePageStdUser.setBagPack();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink2(){
        HomePageStdUser.setBikeLight();
        driver.navigate().back();
    }
    @Test (dependsOnMethods = "Test1")
    public void checkLink3(){
        HomePageStdUser.setJacket();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink4(){
        HomePageStdUser.setOnesie();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink5(){
        HomePageStdUser.settShirt();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink6(){
        HomePageStdUser.settRed();
        driver.navigate().back();
    }
}
