package ru.netology.postman_echo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {
    @Test
    void shouldPostmanEcho() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Данные не на латинице")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Данные не на латинице"))
        ;
    }
}
