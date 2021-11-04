package com.example.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @GetMapping("test")
    public ResponseEntity<Object> testOk(){
        Map  test= new HashMap();
        test.put("message", "Ok");
        return ResponseEntity.ok(test);
    }
}
