package com.itcoucou.dao;

import com.itcoucou.pojo.User;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有
     * @return
     */
    List<User> findAll();
}
