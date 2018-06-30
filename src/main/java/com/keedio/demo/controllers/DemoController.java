package com.keedio.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/keedio")
public class DemoController {

    @GetMapping(value = "/hello")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String hello() {
        return "Hello from Keedio";
    }
}
