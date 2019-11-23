package com.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})  //msg=chuchu 存在session域中
public class AnnoControler {

    @RequestMapping("/testRequestparam")
    public String testRequestparam(String username){

        System.out.println("执行了……");
        System.out.println(username);
        return "syccess";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){

        System.out.println("执行了……");
        System.out.println(body);
        return "syccess";
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){

        model.addAttribute("msg","chuchu");

        return "message";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){

        modelMap.get("msg");

        return "message";
    }


    @RequestMapping("/deleteSessionAttributes")
    public String deleteSessionAttributes(SessionStatus status){

        //删除域对象
        status.setComplete();

        return "message";
    }





}
