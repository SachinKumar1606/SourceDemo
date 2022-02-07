package Test;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginModule extends Base {

    @Test
    public void Test1(){
        LoginPage.LoginStdUser();
    }

    @Test (dependsOnMethods = "Test1")
    public void Test2() throws InterruptedException {
        LoginPage.logoutM();
    }


}