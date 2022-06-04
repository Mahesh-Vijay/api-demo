package com.bruce.mscdept.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {


    @GetMapping(path = "/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok().body("Hello Kgisl, This is Mahesh Simple Task");
    }
}
