package com.tietoevry.teis.mw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthResource {

	@GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

}
 