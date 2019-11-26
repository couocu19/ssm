package com.service.impl;

import com.pojo.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Override
    public List<Account> findAll() {
        System.out.println("findAll.....");
        return null;
    }

    @Override
    public void addAccount(Account account) {

    }
}
