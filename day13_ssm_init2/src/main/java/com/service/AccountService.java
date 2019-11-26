package com.service;

import com.pojo.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public void addAccount(Account account);

}
