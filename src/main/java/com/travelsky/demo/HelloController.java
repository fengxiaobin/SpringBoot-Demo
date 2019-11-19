package com.travelsky.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello SpringBoot!";
    }

    public static void main(String[] args) {
        System.out.println("Hello GitHub !");
    }

}
