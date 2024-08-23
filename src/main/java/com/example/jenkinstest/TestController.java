package com.example.jenkinstest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public ResponseEntity<String> test(String name, Long price){

        return ResponseEntity.ok("v1");
    }
}
