package utils;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class get {

    public static Response makeGet(String URL){
        Response response = given()
                .header("Contentn-type","application/sjon")
                .when()
                .get(URL)
                .then()
                .extract().response();
        return response;
    }
}