package rest;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static rest.restPage.REQ_SPEC;

public class restTest {

    @Test
    public void getUsers() {
        given().spec(REQ_SPEC).get().then().log().all().statusCode(200);
    }

    @Test
    public void getUser() {
        given().spec(REQ_SPEC).basePath("3").get().then().log().all().statusCode(200);
    }


}
