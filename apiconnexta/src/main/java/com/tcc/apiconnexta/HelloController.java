package com.tcc.apiconnexta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String dizerOla() {
        return "Olá, maninha!";
    }
}
