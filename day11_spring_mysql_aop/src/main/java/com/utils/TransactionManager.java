package com.utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 事务管理类:开启事务，提交事务，回滚事务，释放连接
 */

@Component("txManager")
@Aspect //表名该类是切面类
public class TransactionManager {


    @Pointcut("execution(* com.service.impl.AccountServiceImpl.*.*(..))")
    private void pt(){

    }

    /**
     * 开启事务
     */
    @Before("pt()")
    public void beginTransaction(){

    }

    /**
     * 提交事务
     */

    @AfterReturning("pt()")
    public void commit(){

    }


    /**
     * 回滚事务
     */
    @AfterThrowing("pt()")
    public void rollback(){

    }


    /**
     * 释放连接
     */
    @After("pt()")
    public void release(){

    }





}
