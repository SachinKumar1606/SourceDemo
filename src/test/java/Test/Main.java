package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main extends Base {

    @Test
    public void Test1(){
        Base.LoginStdUser();
    }

    @Test (dependsOnMethods = "Test1")
    public void Test2() throws InterruptedException {
        Base.logoutM();
    }


}
