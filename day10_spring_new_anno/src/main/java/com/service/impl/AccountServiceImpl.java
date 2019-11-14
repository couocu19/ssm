package com.service.impl;

import com.dao.AccountDao;
import com.pojo.Account;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *事务的控制应该都在service层
 */
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {


    @Autowired
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

    public void transfer(String name1, String name2, float money) {
        //获取转账人名字
        Account n1 = accountDao.getByName(name1);
        //获取收款人名字
        Account n2 = accountDao.getByName(name2);
        //转账人减钱
        float m1 = n1.getMoney();
        m1 = m1-money;
        n1.setMoney(m1);
        //收款人加钱
        float m2 = n2.getMoney();
        m2 = m2+money;
        n2.setMoney(m2);
        //更新转账人信息
        accountDao.updataAccount(n1);
        //更新收款人信息
        accountDao.updataAccount(n2);
    }

}
