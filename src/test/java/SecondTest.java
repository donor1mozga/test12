import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class SecondTest {

    @Test
    public void mainTwo() {
        System.out.println("Finished test");
        open("https://www.ctrs.com.ua/");
        sleep(5000);
    }
}
