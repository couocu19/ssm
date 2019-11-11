package com.factory;


/**
 * 一个创Bean对象的工厂
 *  Bean:在计算机英语中，有可重用组件的含义
 *  JavaBean： 用java语言编写的可重用组件
 *        JavaBean > 实体类
 *        是来创建service和dao对象的
 *  基本思路：
 *     1.需要一个配置文件来配置service和dao。
 *        配置内容： 唯一标识=全限定类名
 *     2.通过读取配置文件中配置的内容，反射来创建对象
 *
 */
public class Beanfactory {



}
