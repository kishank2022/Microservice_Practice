package com.inventory.management;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

@QuarkusTest
class ProductControllerTest {

	
    @Test
    void createProductTest() {
        given()
          .contentType(ContentType.JSON)
          .body("""
              {
                "name": "Bus1",
                "description":"This is bus1",
                "quantity": 2,
                "price": 600,
                "supplier":"Bhandup"
              }
          """)
          .when()
          .post("/products")
          .then()
          .statusCode(201);
    }
}
