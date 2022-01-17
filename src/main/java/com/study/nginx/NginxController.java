package com.study.nginx;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NginxController {
    @GetMapping
    public ResponseEntity<Object> hello(){
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }
}
