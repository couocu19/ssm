package com.dao;

import com.pojo.User;


import java.util.List;

public interface UserDao {

    /**
     * 同时获取到某个用户的信息以及用户下所有的账户信息
     * @return
     */
    List<User> findAll();
    User getById(int id);
}
