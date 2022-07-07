package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:${device}.properties"
})

public interface WebConfig extends Config {
    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();


    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    String getRemoteUrl();

    @Key("browserVersion")
    @DefaultValue("100")
    String getBrowserVersion();

}