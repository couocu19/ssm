package com.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.activation.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component("connectionUtils")
public class ConnectionUtils {

    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

//
//    @Autowired
//    private DataSource dataSource;
//
//
//    public  Connection getCurrentConnection(){
//        try {
//            //1.先从ThreadLocal上获取连接
//            Connection con = tl.get();
//            //2.判断当前线程上是否有绑定连接
//            if (con == null){
//                //3.如果没有，获取新的连接
//                con = dataSource.getConnection();
//                //4.将当前连接与线程绑定
//                tl.set(con);
//            }
//            //5.返回与当前线程绑定的连接
//            return  con;
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void removeConnection(){
//        //将连接对象与线程解绑
//        tl.remove();
//    }
//
}
