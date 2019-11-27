package com.test;

import com.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatis  {

    @Test
    public void testFindAll(){

        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

            SqlSession session = sqlSessionFactory.openSession();
            AccountDao dao = session.getMapper(AccountDao.class);
            dao.findAll();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testAdd(){
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            SqlSession session = sqlSessionFactory.openSession();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
