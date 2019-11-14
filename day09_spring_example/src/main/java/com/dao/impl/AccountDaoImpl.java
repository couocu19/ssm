package com.dao.impl;

import com.dao.AccountDao;
import com.pojo.Account;
import com.service.impl.AccountServiceImpl;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {

    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }


    public AccountDaoImpl(){

    }

    public List<Account> findAll() {
        List<Account> list = null;
        try {
            list =  runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addAccount(Account a) {
        try {
            runner.update("insert into account (name,money) values(?,?)", a.getName(),a.getMoney());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteAccount(int id) {
        try {
            runner.update("delete from account where id = ?", id);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void updataAccount(Account a) {
        try {
            runner.update("update account set name = ? , money = ? where id = ?", a.getName(),a.getMoney(),a.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Account getAccount(int id) {
        Account a = null;
        try {
            a = runner.query("select * from account where id = ?",new BeanHandler<Account>(Account.class),id);
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return a;
    }
}
