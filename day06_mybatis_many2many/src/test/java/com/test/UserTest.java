package com.test;


import com.dao.RoleDao;
import com.dao.UserDao;
import com.pojo.Role;
import com.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class UserTest extends BaseTest {

    @Test
    public void testFindAll(){
        SqlSession session = getSqlSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> list = userDao.findAll();
        printList(list);


    }


    private void printList(List<User> list){
        for(User u:list){
            System.out.println(u);
            if(u.getRoles().size()>0){
                System.out.println("该用户对应的角色有:");
                for(Role r:u.getRoles()){
                    System.out.println(r);
                }
            }else{
                System.out.println("该用户没有对应的角色");

            }
        }
    }
}
