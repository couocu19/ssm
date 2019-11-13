package com.service.impl;

import com.dao.AccountDao;
import com.pojo.Account;
import com.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }

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
