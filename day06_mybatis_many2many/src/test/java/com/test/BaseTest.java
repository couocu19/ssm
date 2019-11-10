package com.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.InputStream;

public class BaseTest {

    private static SqlSessionFactory factory;
    private static SqlSession session;

    @BeforeClass
    public static void init(){
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

            factory = new SqlSessionFactoryBuilder().build(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SqlSession getSqlSession(){
        session = factory.openSession();
        return session;
    }

    @After
    public void destory(){
        session.close();


    }

}
