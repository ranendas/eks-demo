package com.test.eks.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EksTestController {

    @GetMapping("/test")
    public String test(){
        log.info("Eks testing successful");

        return "Eks testing successful";
    }
}
