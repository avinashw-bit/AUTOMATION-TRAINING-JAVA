package com.aw.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleApiTest {

    @Test
    public void usersPageShouldBeTwo() {
        Response response = RestAssured
                .given()
                .accept(ContentType.JSON)
                .queryParam("page", 2)
                .when()
                .get("https://reqres.in/api/users");

        Assert.assertEquals(response.statusCode(), 200);
        int page = response.jsonPath().getInt("page");
        Assert.assertEquals(page, 2, "Expected page to be 2");
    }
}


