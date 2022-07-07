package tests;

import config.ApiConfig;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;
import org.aeonbits.owner.ConfigFactory;


public class ApiTest {
    @Test
    void loginTest() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        RestAssured.baseURI=config.baseUri();

        String body = "{ \"email\": \"eve.holt@reqres.in\", " +
                "\"password\": \"cityslicka\" }";

        given()
                .log().uri()
                .log().body()
                .body(body)
                .contentType(JSON)
                .when()
                .post("api/login")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("token", is(config.token()));
    }
}
