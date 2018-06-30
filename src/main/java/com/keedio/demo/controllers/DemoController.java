package com.keedio.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello from Keedio";
    }
}
