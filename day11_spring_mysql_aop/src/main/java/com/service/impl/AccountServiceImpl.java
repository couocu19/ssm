package com.service.impl;

import com.dao.AccountDao;
import com.pojo.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//
//@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

//
//    @Autowired
    private AccountDao accountDao;


    public AccountServiceImpl(){

    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public void addAccount(Account a) {
        accountDao.addAccount(a);

    }

    public void deleteAccount(int id) {
        accountDao.deleteAccount(id);

    }

    public void updataAccount(Account a) {
        accountDao.updataAccount(a);

    }

    public Account getAccount(int id) {
        return accountDao.getAccount(id);
    }
}
