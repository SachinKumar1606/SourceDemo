package Test;

import Base.Base;
import org.testng.annotations.Test;

import java.io.IOException;

public class Main extends Base {

    Base log = new Base();

    @Test
    void correctDetails() throws IOException {
        log.loginPass();
    }

    @Test
    void incorrectDetails() throws IOException {
        log.loginFail();
    }
}
