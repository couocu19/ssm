package com.test;

import com.dao.impl.AccountDaoImpl;
import com.pojo.Account;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTest {


//    @Autowired
//    private AccountDaoImpl accountDao;


    @Test
    public void testAdd(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        AccountDaoImpl accountDao = ac.getBean("accountDao",AccountDaoImpl.class);
        Account a = new Account("哈哈哈",10);
        accountDao.addAccount(a);

    }
    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountDaoImpl accountDao = ac.getBean("accountDao",AccountDaoImpl.class);
        List<Account> list = accountDao.findAll();
        for(Account a:list){
            System.out.println(a);
        }



    }
    @Test
    public void testDelete(){

    }
    @Test
    public void testUpdate(){

    }
    @Test
    public void testfindById(){

    }



}
