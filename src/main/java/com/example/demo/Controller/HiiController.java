
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiiController {

    @GetMapping("/hii")
    public String sayHii() {
        return "Hii, Spring Boot!";
    }
}
