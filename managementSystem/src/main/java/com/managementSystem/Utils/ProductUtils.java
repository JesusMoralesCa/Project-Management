package com.managementSystem.Utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ProductUtils {

    private ProductUtils(){

    }

    public static ResponseEntity<String> getResposeEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"messag\":\""+ responseMessage+"\"}", httpStatus);

    }


}
