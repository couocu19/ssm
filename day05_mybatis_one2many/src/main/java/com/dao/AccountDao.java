package com.dao;

import com.pojo.Account;
import com.pojo.AccountUser;

import java.util.List;

/**
 * 可用来操作一对一或者从多对一的情况与主表关联
 */
public interface AccountDao {

    List<Account> findAll();

    /**
     * 查询所有账户，并且带有账户所对应的用户信息
     */
    List<AccountUser> findAllAccount();


    List<Account> findAllAccountAndUser();


}
