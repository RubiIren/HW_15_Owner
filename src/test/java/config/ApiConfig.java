package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;


@Sources({
        "classpath:api.properties"
})
public interface ApiConfig extends Config {

    @Key("baseUri")
    @DefaultValue("")
    String baseUri();

    @Key("token")
    @DefaultValue("")
    String token();
}