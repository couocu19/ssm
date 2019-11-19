package com.dao.impl;

import com.dao.AccountDao;
import com.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import java.util.List;


public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


    public List<Account> findAll() {
        List<Account> list = null;
        list =  super.getJdbcTemplate().query("select * from account",new BeanPropertyRowMapper<Account>(Account.class));

        return list;
    }

    public void addAccount(Account a) {
        try {
            super.getJdbcTemplate().update("insert into account (name,money) values(?,?)", a.getName(),a.getMoney());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteAccount(int id) {
        try {
            super.getJdbcTemplate().update("delete from account where id = ?", id);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void updataAccount(Account a) {
        try {
            super. getJdbcTemplate().update("update account set name = ? , money = ? where id = ?", a.getName(),a.getMoney(),a.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Account getAccount(int id) {
        Account a = null;
        a =  super.getJdbcTemplate().queryForObject("select * from account where id = ?",new BeanPropertyRowMapper<Account>(Account.class),id);

        return a;
    }
}
