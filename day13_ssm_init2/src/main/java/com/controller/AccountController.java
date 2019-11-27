package com.controller;

import com.pojo.Account;
import com.service.AccountService;
import com.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/anno")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/list")
    public String findAll(Model model){
        System.out.println("findAll()...");
        //调用service类下的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);

        return "list";
    }
}
