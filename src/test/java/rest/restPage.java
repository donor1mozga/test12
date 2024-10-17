package rest;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class restPage {

    static final RequestSpecification REQ_SPEC =
            new RequestSpecBuilder()
                    .addFilter(new AllureRestAssured())
                    .setBaseUri("https://reqres.in/api")
                    .setBasePath("/users")
                    .setContentType(ContentType.JSON)
                    .build();





}
