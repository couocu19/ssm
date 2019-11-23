package com.controller;

import com.pojo.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {

    @RequestMapping(path = "/user",method = {RequestMethod.POST})
    public String saveAccount(Account account){
        System.out.println(account);
        return "message";

    }

}
