package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Main extends Base {

    Base log = new Base();

    public Main(WebDriver driver) {
        super();
    }
//    @Test
    public void Test1(){
       log.LoginStdUser();
    }



}
