package org.example.api;

import org.example.api.implementations.CustomInterfaceImpl;
import org.example.api.interfaces.CustomInterface;

public class MainProgram {
public static void main(String[] args){
    CustomInterface customInterface = new CustomInterfaceImpl();
    System.out.println("Addition: "+customInterface.addNumbers(1,2));
    System.out.println("Subtraction: "+customInterface.subtractNumbers(1,2));
    System.out.println("Multiplication: "+customInterface.multiplyNumbers(1,2));
    System.out.println("Division: "+customInterface.divideNumbers(5,2));
    String URL = "http://restapi.demoqa.com/utilities/weather/city/Bangalore";
    String method = "GET";
    String response  = customInterface.CustomHttpRequest(method,URL);
    System.out.println("Response: " +response);
}
}
