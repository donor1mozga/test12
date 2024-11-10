package ui;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class SecondTest {

    @BeforeClass
    public void set() {
        ChromeOptions options = new ChromeOptions();
        Configuration.remote = "http://localhost:4444/wd/hub";
        Map<String, Object> so = new HashMap<>();
        so.put("enableVNC", true);
        so.put("enableVideo", false);
        so.put("sessionTimeout", "3m");
        options.setCapability("browserVersion", "127.0");
        options.setCapability("selenoid:options", so);
        Configuration.browserSize= "1920x1080";
        Configuration.browserCapabilities = options;   }

    @Test
    public void mainTwo() {
        System.out.println("Finished test");
        open("https://doctorpro.pl/lodz");
        System.out.println(getUserAgent());
        sleep(5000);
        closeWebDriver();
    }
}
