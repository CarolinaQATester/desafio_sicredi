package com.sicredi.util;

import io.restassured.RestAssured;

public class BaseApi {

    public static void steup(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RestAssured.baseURI= "http://localhost:8080";
        RestAssured.basePath = "/api/v1";
    }
}
