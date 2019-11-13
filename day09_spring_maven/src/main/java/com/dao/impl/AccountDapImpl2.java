package com.dao.impl;

import com.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao1")
public class AccountDapImpl2 implements AccountDao {

    public void saveAccount() {
        System.out.println("正在保存");

    }
}
