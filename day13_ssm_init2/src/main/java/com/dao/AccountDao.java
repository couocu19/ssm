package com.dao;

import com.pojo.Account;

import java.util.List;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao {

   @Select("select * from account")
    public List<Account> findAll();


   @Insert("insert into account (name,money) values(#{name},#{money})")
    public void addAccount(Account account);

}
