package com.dao.impl;

import com.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao2")
public class AccountDaoImpl implements AccountDao {

    public void saveAccount() {
        System.out.println("正在保存");

    }
}
