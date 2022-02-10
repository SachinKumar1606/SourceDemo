package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCartPage extends Base {

    @Test
    public void login(){
        pageFactory.getLoginPage().LoginStdUser();
    }

    @Test (dependsOnMethods = "login")
    public void checkPName1() throws InterruptedException {
        pageFactory.getHomePage().setBagPackCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Sauce Labs Backpack";
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkPName2(){
        pageFactory.getHomePage().setBikeLightCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Sauce Labs Bike Light";
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkPName3(){
        pageFactory.getHomePage().settRedCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Test.allTheThings() T-Shirt (Red)";
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkPName4(){
        pageFactory.getHomePage().settShirtCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Sauce Labs Bolt T-Shirt";
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkPName5(){
        pageFactory.getHomePage().setJacketCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Sauce Labs Fleece Jacket";
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkPName6(){
        pageFactory.getHomePage().setOnesieCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className("inventory_details_name")).getText();
        String exp = "Sauce Labs Onesie";
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }
}
