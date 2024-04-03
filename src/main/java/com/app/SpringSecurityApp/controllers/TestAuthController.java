package com.app.SpringSecurityApp.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/method")
//@PreAuthorize("denyAll()")

public class TestAuthController {


    @GetMapping("/get")
    public String helloGet(){
        return "Hello World - GET";
    }
    @PutMapping("/put")
    public String helloPut(){
        return "Hello World - PUT";
    }
    @PostMapping("/post")
    public String helloPost(){
        return "Hello World - POST";
    }
    @DeleteMapping("/delete")
    public String helloDelete(){
        return "Hello World - DELETE";
    }
    @PatchMapping("/patch")

    public String helloPatch(){
        return "Hello World - PATCH";
    }
}
