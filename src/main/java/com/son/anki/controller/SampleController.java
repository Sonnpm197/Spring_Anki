package com.son.anki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("hello")
    public String hello() {
        return "Hello from Anki";
    }
}
