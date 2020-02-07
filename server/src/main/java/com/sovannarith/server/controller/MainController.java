package com.sovannarith.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public ResponseEntity<Object> hello(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

}
