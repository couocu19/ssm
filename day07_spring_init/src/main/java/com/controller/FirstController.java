package com.controller;

import com.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/first")
public class FirstController {
    private MyService myService;
    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String firstMethod() {
        return myService.test();
    }
}
