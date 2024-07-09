package com.project1.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class studentController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello! welcome to the spring mvc";
    }
}
