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

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        AccountService as = ac.getBean("accountService",AccountService.class);
        List<Account> accounts = as.findAll();

        for(Account account:accounts){
            System.out.println(account);
        }

    }
    @Test
    public void testFindOne(){


    }




}
