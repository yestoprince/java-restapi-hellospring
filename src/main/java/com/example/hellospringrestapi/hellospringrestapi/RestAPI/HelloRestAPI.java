package com.example.hellospringrestapi.hellospringrestapi.RestAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestAPI {
    @RequestMapping("/api/welcome")
    public String welcome(){
        return "Welcome to Spring API";
    }
}
