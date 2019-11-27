package com.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.InputStream;

/**
 * 基础测试类
 */
public class BaseMapperTest {
    private static SqlSessionFactory sqlSessionFactory;
    //用于在测试方法之前执行
    @BeforeClass
    public static void init(){
        try {
            //读取资源文件
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public SqlSession getSqlSession(){
        //获取代理对象
        return sqlSessionFactory.openSession();
    }



}
