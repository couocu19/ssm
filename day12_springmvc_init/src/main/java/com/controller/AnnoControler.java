package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/anno")
public class AnnoControler {

    @RequestMapping("/testRequestparam")
    public String testRequestparam(String username){

        System.out.println("执行了……");
        System.out.println(username);
        return "syccess";
    }




}
