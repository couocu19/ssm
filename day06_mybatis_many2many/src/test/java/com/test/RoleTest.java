package com.test;

import com.dao.RoleDao;
import com.pojo.Role;
import com.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class RoleTest extends BaseTest {

    @Test
    public void testFindAll(){
        SqlSession session = getSqlSession();
        RoleDao roleDao = session.getMapper(RoleDao.class);
        List<Role> list = roleDao.findAll();
        printList(list);


    }

    private void printList(List<Role> list){

        for(Role r:list){
            System.out.println(r);
            if(r.getUsers().size()>0){
                System.out.println("这个角色对应的用户有:");
                for(User u:r.getUsers()){
                    System.out.println(u);
                }
                System.out.println("-------------------");
            }else{
                System.out.println("这个角色没有对应的用户~");
            }
        }
    }


}

