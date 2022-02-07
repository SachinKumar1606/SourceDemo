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
    public void checkPic1(){
        HomePageStdUser.setBagPackPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkPic2(){
        HomePageStdUser.setBikeLightPic();
        driver.navigate().back();
    }
    @Test (dependsOnMethods = "Test1")
    public void checkPic3(){
        HomePageStdUser.setJacketPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkPic4(){
        HomePageStdUser.setOnesiePic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkPic5(){
        HomePageStdUser.settShirtPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkPic6(){
        HomePageStdUser.settRedPic();
        driver.navigate().back();
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

    @Test (dependsOnMethods = "Test1")
    public void checkCart1(){
        HomePageStdUser.setBagPackCart();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkCart2(){
        HomePageStdUser.setBikeLightCart();
    }
    @Test (dependsOnMethods = "Test1")
    public void checkCart3(){
        HomePageStdUser.setJacketCart();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkCart4(){
        HomePageStdUser.setOnesieCart();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkCart5(){
        HomePageStdUser.settShirtCart();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkCart6() {
        HomePageStdUser.settRedCart();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLinkedIn(){
        HomePageStdUser.setLinkedIn();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkTwitter() {
        HomePageStdUser.setTwitter();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkFacebook() {
        HomePageStdUser.setFacebook();
    }
}
