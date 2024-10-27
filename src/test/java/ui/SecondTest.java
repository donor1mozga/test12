package ui;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class SecondTest {

    @Test
    public void mainTwo() {
        System.out.println("Finished test");
        open("https://doctorpro.pl/lodz");
        System.out.println(getUserAgent());
        sleep(5000);
        closeWebDriver();
    }
}
