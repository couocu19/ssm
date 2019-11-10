package com.dao;

import com.pojo.Role;

import java.util.List;

public interface RoleDao  {
    //查询角色，同时获取角色所赋予的所有用户，返回的是一个集合
    List<Role> findAll();


}
