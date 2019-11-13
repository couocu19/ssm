package com.service.impl;


import com.service.AccountService;

import java.util.Date;


public class AccountServiceImpl implements AccountService{

    private String name;
    private int age;
    private Date birthday;

  public AccountServiceImpl(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "AccountServiceImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public void saveAccount() {
        System.out.println("正在执行");
    }

}
