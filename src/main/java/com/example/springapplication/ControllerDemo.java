package com.example.springapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testController")
public class ControllerDemo {

    @Autowired
    private MyComponentDemo demo;

    @RequestMapping("/test")
    public String testMethod(){
        System.out.println(demo.sayHello());
        return "success";
    }
}
