package com.example.demo.servlets;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/hello")
    @ResponseBody
    public String getHello(){
        return "<h1>Hello spring application</h1>";
    }
}
