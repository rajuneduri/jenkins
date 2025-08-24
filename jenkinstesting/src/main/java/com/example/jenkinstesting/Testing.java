package com.example.jenkinstesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {

    @GetMapping("/tet")
    public String testing(){
        return "Jenkinsfile";
    }
    @GetMapping("/tetw")
    public String testingww(){
        return "Jenkinsfile22";
    }
}
