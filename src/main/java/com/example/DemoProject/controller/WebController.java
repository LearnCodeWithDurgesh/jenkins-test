package com.example.DemoProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {
    @RequestMapping("/")
    public String testing() {
        return "testing app";
    }
}
