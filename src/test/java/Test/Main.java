package Test;

import Base.Base;
import org.testng.annotations.Test;

import java.io.IOException;

public class Main extends Base {

    Base log = new Base();

    @Test
    void checkLogin() throws IOException {
        log.login();
    }

}
