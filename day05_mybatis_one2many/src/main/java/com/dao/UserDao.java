package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {

    List<User> findAll();
    User getById(int id);
}
