package com.dao;

import com.pojo.Account;

import java.util.List;
import org.apache.ibatis.annotations.*;

public interface AccountDao {

//    @Select("select * from account")
    public List<Account> findAll();

    public void addAccount(Account account);

}
