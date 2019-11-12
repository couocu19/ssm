package com.service.impl;

import com.dao.AccountDao;
import com.dao.impl.AccountDaoImpl;
import com.service.AccountService;


public class AccountServiceImpl implements AccountService{

    //并没有做到程序的耦合
    private AccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
       accountDao.saveAccount();
    }
}
