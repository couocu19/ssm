package com.dao;


import com.pojo.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();

    void addAccount(Account a);
    void deleteAccount(int id);
    void updataAccount(Account a);
    Account getAccount(int id);



}
