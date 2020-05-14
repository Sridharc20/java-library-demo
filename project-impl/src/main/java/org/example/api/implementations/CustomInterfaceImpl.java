package org.example.api.implementations;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.api.interfaces.CustomInterface;

public class CustomInterfaceImpl implements CustomInterface {
    public Integer addNumbers(Integer integer, Integer integer1) {
        System.out.println("org.example.api.implementations.Addition");
        return integer+integer1;
    }

    public Integer subtractNumbers(Integer integer, Integer integer1) {
        System.out.println("org.example.api.implementations.Subtraction");
        return integer-integer1;
    }

    public Integer multiplyNumbers(Integer integer, Integer integer1) {
        System.out.println("org.example.api.implementations.Multiplication");
        return integer*integer1;
    }

    public Double divideNumbers(Integer integer, Integer integer1) {
        System.out.println("org.example.api.implementations.Division");
        return new Double(integer/integer1);
    }

    public String CustomHttpRequest(String method, String url) {
        System.out.println("org.example.api.implementations.CustomHttpRequest");
        RestAssured.baseURI = url;
        RequestSpecification specification = RestAssured.given();
        Response response=null;
        if(method.equals("GET")){
            response = specification.request(Method.GET);
        }
        String responseBody = response.getBody().asString();
        return responseBody;
    }
}
