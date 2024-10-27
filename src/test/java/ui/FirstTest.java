package ui;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest {


    @Test
    public void main() {
        System.out.println("Start test");
        open("https://www.mediaexpert.pl/");
        System.out.println(getUserAgent());
        sleep(5000);
        closeWebDriver();
    }
}
