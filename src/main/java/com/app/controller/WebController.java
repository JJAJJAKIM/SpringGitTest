package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private TestMapper tm;

    @GetMapping("/")
    public String home() {
        return "하잉하잉 (" + tm.testDB() +")";
    }
}
