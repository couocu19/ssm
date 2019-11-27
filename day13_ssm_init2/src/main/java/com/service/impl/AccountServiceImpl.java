package com.service.impl;

import com.dao.AccountDao;
import com.pojo.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("findAll.....");
        return accountDao.findAll();
    }

    @Override
    public void addAccount(Account account) {

    }
}
