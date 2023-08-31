package com.example.DemoProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/page")
public class PageController {

    @GetMapping("/")
    public Map<String, ?> homePageData() {
        return Map.of(
                "message", "This is home page data",
                "status", HttpStatus.OK
        );
    }

}
