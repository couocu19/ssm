package com.service;

import com.pojo.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void addAccount(Account a);
    void deleteAccount(int id);
    void updataAccount(Account a);
    Account getAccount(int id);

    void transfer(String name1,String name2,float money);

}
