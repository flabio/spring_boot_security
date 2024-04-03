package com.app.SpringSecurityApp.controllers;

import com.app.SpringSecurityApp.Service.UserDetailServiceImpl;
import com.app.SpringSecurityApp.controllers.dto.AuthLoginRequest;
import com.app.SpringSecurityApp.controllers.dto.AuthReponse;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @Autowired
    private  UserDetailServiceImpl userDetailService;


    @PostMapping("/log-in")
    public ResponseEntity<AuthReponse> login(@RequestBody @Valid AuthLoginRequest userRequest){
        try{
            return new ResponseEntity<>(this.userDetailService.loginUser(userRequest), HttpStatus.OK);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }

    }
}
