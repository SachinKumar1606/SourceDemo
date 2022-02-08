package Test;

import Pages.HomePageStdUser;
import Pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyHomePage extends Base {

    @Test
    public void Test1() throws IOException {
        pageFactory.getLoginPage().LoginStdUser();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkPic1(){
        pageFactory.getHomePage().setBagPackPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkPic2(){
        pageFactory.getHomePage().setBikeLightPic();
        driver.navigate().back();
    }
    @Test (dependsOnMethods = "Test1")
    public void checkPic3(){
        pageFactory.getHomePage().setJacketPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkPic4(){
        pageFactory.getHomePage().setOnesiePic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkPic5(){
        pageFactory.getHomePage().settShirtPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkPic6(){
        pageFactory.getHomePage().settRedPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink1(){
        pageFactory.getHomePage().setBagPack();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink2(){
        pageFactory.getHomePage().setBikeLight();
        driver.navigate().back();
    }
    @Test (dependsOnMethods = "Test1")
    public void checkLink3(){
        pageFactory.getHomePage().setJacket();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink4(){
        pageFactory.getHomePage().setOnesie();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink5(){
        pageFactory.getHomePage().settShirt();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLink6(){
        pageFactory.getHomePage().settRed();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkCart1(){
        pageFactory.getHomePage().setBagPackCart();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkCart2(){
        pageFactory.getHomePage().setBikeLightCart();
    }
    @Test (dependsOnMethods = "Test1")
    public void checkCart3(){
        pageFactory.getHomePage().setJacketCart();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkCart4(){
        pageFactory.getHomePage().setOnesieCart();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkCart5(){
        pageFactory.getHomePage().settShirtCart();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkCart6() {
        pageFactory.getHomePage().settRedCart();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkLinkedIn(){
        pageFactory.getHomePage().setLinkedIn();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkTwitter() {
        pageFactory.getHomePage().setTwitter();
    }

    @Test (dependsOnMethods = "Test1")
    public void checkFacebook() {
        pageFactory.getHomePage().setFacebook();
    }
}
