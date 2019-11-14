package com.test;

import com.pojo.Account;
import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用Junit单元测试，测试配置
 * Spring整合junit的配置
 *    1.导入整合junit的jar包
 *    2.使用Junit提供的注解把所有的main方法替换掉，替换为spring配置的 @RunWith()
 *    3.告知spring的运行器 @ContextConfiguration
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class AccountServiceTest {

    @Autowired
    AccountService as;


    @Test
    public void testFindAll(){

        List<Account> accounts = as.findAll();

        for(Account account:accounts){
            System.out.println(account);
        }

    }
    @Test
    public void testTransfer(){
        as.transfer("aaa","张三",100);

    }

}
