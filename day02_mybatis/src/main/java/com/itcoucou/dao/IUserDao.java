package com.itcoucou.dao;

import com.itcoucou.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IUserDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from user")
    List<User> findAll();

//    /**
//     * 增加用户
//     * @param user
//     */
    @Insert("insert into user (uasename,birthday,sex,address) values (#{uasename},#{birthday},#{sex},#{address})")
    void addUser(User user);
//
//    /**
//     * 删除用户
//     * @param id
//     */
    @Delete("delete from user where id = #{id}")
    void deleteUser(int id);
//
//    /**
//     * 更新用户信息
//     * @param user
//     */
    @Update("update user set address = #{address} where id = #{id}")
    void updateUser(User user);
//
//    /**
//     * 查看某个用户
//     * @param id
//     * @return
//     */
    @Select("select * from user where id = #{id}")
    User getUser(int id);

}
