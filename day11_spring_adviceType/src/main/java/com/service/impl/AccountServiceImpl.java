package com.service.impl;

import com.service.AccountService;

public class AccountServiceImpl implements AccountService {

    public void addAccount() {
       //int i = 1/0;
        System.out.println("执行增加");

    }

    public void updateAccount(int i) {
        System.out.println("执行更新 "+i);

    }

    public int deleteAccount() {
        System.out.println("执行删除");
        return 0;
    }


}
