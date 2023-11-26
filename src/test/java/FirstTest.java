import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class FirstTest {


    @Test
    public void main() {
        System.out.println("Start test");
        open("https://rozetka.com.ua/");
        sleep(5000);
    }
}
