package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;
import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class WebTest {
    @Test
    public void webTest() {
        WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

        Configuration.browserSize = config.getBrowserSize();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        if (!config.getRemoteUrl().equals("")) {
            Configuration.remote = config.getRemoteUrl();
        }

        open("http://awg.ru");
        $(By.className("header-menu__phone")).shouldHave(text("+7 495 278-07-08"));
    }
}
