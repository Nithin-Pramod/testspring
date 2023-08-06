package com.storror.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {

    @GetMapping
    public String welcome(){
        return "Start page";
    }

    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello from spring application";
    }

}
