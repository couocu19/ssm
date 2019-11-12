package com.ui;


import com.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    /**
     * 获取soring的Ico核心容器对象
     * @param args
     */
    public static void main(String[] args) {


        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean对象
        AccountService as = (AccountService)ac.getBean("accountService");
        System.out.println(as);
        as.saveAccount();

    }
}
