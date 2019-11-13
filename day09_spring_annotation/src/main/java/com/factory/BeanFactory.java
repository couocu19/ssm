package com.factory;

import com.service.AccountService;
import com.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类
 * 该类有可能存在于jar包中,我们无法通过修改源码的方式来提供默认构造函数
 */
public class BeanFactory {

    public static AccountService getAccountService(){

        return new AccountServiceImpl();
    }





}
