package com.test;


import com.dao.AccountDao;
import com.pojo.Account;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AccountTest extends BaseTest {

    @Test
    public void testFindAll(){
        SqlSession session = getSqlSession();
        AccountDao accountDao = session.getMapper(AccountDao.class);

        List<Account> list = accountDao.findAll();
        printList(list );

    }


    private void printList(List<Account> list){

        for(Account a:list){
            System.out.println(a);
        }

    }







}
