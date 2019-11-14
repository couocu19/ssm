package com.test;

import com.pojo.Account;
import com.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountServiceTest {

    @Test
    public void testFindAll(){

        //获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //得到业务层对象
        AccountService as = ac.getBean("accountService",AccountService.class);
        List<Account> accounts = as.findAll();

        for(Account account:accounts){
            System.out.println(account);
        }

    }
    @Test
    public void testFindOne(){
        //获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //得到业务层对象
        AccountService as = ac.getBean("accountService",AccountService.class);
        Account a = as.getAccount(1);
        System.out.println(a);


    }

    @Test
    public void testAdd(){
        //获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        AccountService as = ac.getBean("accountService",AccountService.class);
        Account a = new Account("周杰伦",6666);
        as.addAccount(a);

    }
    @Test
    public void testDelete(){
        //获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        AccountService as = ac.getBean("accountService",AccountService.class);

        as.deleteAccount(3);
    }

    @Test
    public void testUpdate(){
        //获取核心容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //得到业务层对象
        AccountService as = ac.getBean("accountService",AccountService.class);

        Account a = new Account(2,"张三",8888);
        as.updataAccount(a);

    }






}
