package com.utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {

    public void beforePrintLog(){
        System.out.println("执行之前的日志……");


    }
    public void returnPrintLog(){
        System.out.println("后置的日志……");


    }
    public void throwingPrintLog(){
        System.out.println("产生异常的日志……");


    }
    public void afterPrintLog(){
        System.out.println("最终的日志……");

    }


    /**
     * 环绕日志
     *   Spring框架为我们提供了一个接口ProceedingJoinPoint。 其中有一个方法 proceed(). 此方法相当于明确调用切入点方法
     *  spring中的环绕通知
     *     是spring框架为我们提供的一种可以在代码中手动控制增强方法何时执行的方式
     */
    public Object aroundPrintLog(ProceedingJoinPoint proceedingJoinPoint){

        Object value = null;

        try {
            Object[] args = proceedingJoinPoint.getArgs(); //得到方法执行所需的参数
            System.out.println("这是一个前置通知");
            value = proceedingJoinPoint.proceed(args);  //调用切入点方法
            System.out.println("这是一个后置通知");

            return value;
        } catch (Throwable throwable) {
            System.out.println("这是一个异常通知");
            throw new RuntimeException(throwable);

        }finally {
            System.out.println("这是一个结束通知……");

        }

    }

}
