package com.managementSystem.RESTimpl;

import com.managementSystem.Constents.ProductConstants;
import com.managementSystem.REST.UserRest;
import com.managementSystem.Service.UserService;
import com.managementSystem.Utils.ProductUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {
    @Autowired
    UserService userService;


    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
       try {
            return userService.signUp(requestMap);
       }catch (Exception ex){
            ex.printStackTrace();
       }
        return ProductUtils.getResposeEntity(ProductConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }




}
