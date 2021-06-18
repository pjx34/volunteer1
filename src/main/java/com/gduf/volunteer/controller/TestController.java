package com.gduf.volunteer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        System.out.println("push test");
        System.out.println("pull test");
        return "index";
    }
}
