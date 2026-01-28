package com.projects.e101.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class WebController {
    @GetMapping("/")
    public String hello() {
        return "index";
    }

}
