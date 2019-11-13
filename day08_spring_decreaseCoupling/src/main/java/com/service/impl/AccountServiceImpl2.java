package com.service.impl;

import com.service.AccountService;

import java.util.Date;

public class AccountServiceImpl2 implements AccountService {

    private String name;
    private int age;
    private Date birthday;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("正在执行");
    }

    @Override
    public String toString() {
        return "AccountServiceImpl2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
