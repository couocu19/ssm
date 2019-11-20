package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器 用来接收请求
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){

        String s = "Hello SpringMvc ~";
        System.out.println(s);

        return "syccess";

    }







}
