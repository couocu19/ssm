package com.controller;

import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/anno")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/list")
    public String findAll(){
        System.out.println("findAll()...");
        //调用service类下的方法
        accountService.findAll();


        return "list";
    }
}
