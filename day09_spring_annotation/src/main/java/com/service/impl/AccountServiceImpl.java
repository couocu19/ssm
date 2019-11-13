package com.service.impl;


import com.service.AccountService;


public class AccountServiceImpl implements AccountService{



    //第一种创建bean对象的方法：若对应的类中没有无参构造器，则会导致bean对象创建失败
//    public AccountServiceImpl(String s){
//        System.out.println("气死你");
//    }

    //并没有做到程序的耦合
    public void saveAccount() {
        System.out.println("正在执行");
    }

    public void init(){
        System.out.println("对象正在初始化");
    }

    public void destory(){

        System.out.println("对象已经够被销毁");
    }
}
