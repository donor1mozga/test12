import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Selenoid {


    public void launch() {
        ChromeOptions options = new ChromeOptions();
        Configuration.remote = "http://localhost:4444/wd/hub";
        Map<String, Object> so = new HashMap<>();
        so.put("enableVNC", true);
        so.put("enableVideo", false);
        so.put("sessionTimeout", "3m");
        options.setCapability("browserVersion", "127.0");
        options.setCapability("selenoid:options", so);
        Configuration.browserCapabilities = options;

    }

}
