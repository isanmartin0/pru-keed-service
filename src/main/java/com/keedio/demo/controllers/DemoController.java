package com.keedio.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello from Keedio";
    }
}
