package com.study.nginx;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class NginxController {
    @Value("${test.name}")
    private String name;

    @GetMapping("/" + "${test.name}")
    public ResponseEntity<Object> hello(){

        return new ResponseEntity<>(name + " hello", HttpStatus.OK);
    }
}
