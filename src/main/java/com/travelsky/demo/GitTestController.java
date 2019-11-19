package com.travelsky.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @GetMapping("/hello")
    public String helloGitHub() {
        return "Hello GitHub SpringBoot!";
    }
}
