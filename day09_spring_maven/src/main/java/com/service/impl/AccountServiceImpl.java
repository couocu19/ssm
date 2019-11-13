package com.service.impl;


import com.dao.AccountDao;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 *曾经xml的配置
 *<bean id="accountService" class="com.service.impl.AccountServiceImpl"/>
 *注解分类：
 *    1.用于创建对象的
 *        Component：
 *           作用：用于把当前类对象存入spring容器中
 *           属性： value:用于指定bean的id。不写时，默认为当前类型首字母改为小写。
 *        Controller:一般用于表现层
 *        Service：一般用于业务层
 *        Repository ：一般用在持久层
 *
 *    2.用于注入数据的
 *       Autowired:
 *          作用：自动按照类型注入。只要容器中有唯一的bean对象类型和要注入的变量类型匹配，就可以注入成功
 *          出现位置：
 *            可以是成员变量上
 *            也可以是方法上
 *           细节：在使用注解注入时，set方法就不是必须的
 *       Qualifier:
 *           作用：在按照类中注入的基础上再按照名称注入。他在给类成员注入时不能单独使用。
 *                 但是在给方法参数注入时可以。
 *           属性：value
 *        Resource
 *           作用：直接按照bean的id注入
 *         注意：集合类型的注入只能通过xml文件来配置。
 *              以上三个集合的注入都只能注入其他bean类型的数据，基本类型和String类型不能。

 *        Value：
 *           用于注入基本类型和String类型
 *           属性：value
 *           可以使用spring中的springEL表达式
 *    3.同遇改变作用范围的
 *    4.和生命周期相关的
 */

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService{

//    @Autowired
//    @Qualifier("accountDao1")  //和上面的注解同时使用
    @Resource(name = "accountDao2")
    private AccountDao accountDao1;

    public void saveAccount() {

       accountDao1.saveAccount();
    }

}
