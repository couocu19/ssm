package com.itcoucou.test;

import com.itcoucou.dao.IUserDao;
import com.itcoucou.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import javax.annotation.Resource;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * 入门案例
 */
public class MybatisTest {
     static SqlSessionFactory ssf;
    static SqlSession ss;
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        MybatisTest m = new MybatisTest();

    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

    //构建模式
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    //工厂模式
        ssf = builder.build(in);
        ss = ssf.openSession();
   //        IUserDao userDao = ss.getMapper(IUserDao.class);
   //
   //        List<User> userList = userDao.findAll();
                                    //        for(User user : userList){
//            System.out.println(user);
//        }
    //  m.add();
        m.delete();
      m.update();
      m.get();
         m.printAll();

    }



    private void add() throws Exception{
        String name;
        String address;
        String birthday;
        Date date;
        String sex;
        SimpleDateFormat sml = new SimpleDateFormat("yyyy-MM-dd");
      //  ss = ssf.openSession();
        IUserDao userDao = ss.getMapper(IUserDao.class);
        User user = null;
        System.out.println("请输入用户信息");
        System.out.println("输入用户名：");
        name = s.next();
        System.out.println("输入生日：");
        birthday = s.next();
        date = sml.parse(birthday);
        System.out.println("输入性别");
        sex = s.next();
        System.out.println("输入地址");
        address = s.next();
        user = new User(name,date,sex,address);
        userDao.addUser(user);
        ss.commit();
        System.out.println("添加成功");
    }
    private void delete(){
         System.out.println("请输入要删除的编号");
        int id = s.nextInt();
        ss = ssf.openSession();
        IUserDao userDao = ss.getMapper(IUserDao.class);
        userDao.deleteUser(id);
        ss.commit();
         System.out.println("删除成功！");

    }
    private void update(){
        ss = ssf.openSession();
        IUserDao userDao = ss.getMapper(IUserDao.class);
        System.out.println("请输入要修改的id");
        int id = s.nextInt();
        User user = userDao.getUser(id);
        System.out.println("请输入要修改的地址:");
        String address = s.next();
        user.setAddress(address);
        userDao.updateUser(user);
        ss.commit();
        System.out.println("更新成功！");
        System.out.println(userDao.getUser(id));
    }
    private User get(){
        ss = ssf.openSession();
        IUserDao userDao = ss.getMapper(IUserDao.class);
        System.out.println("请输入id");
        int id = s.nextInt();
        User user = userDao.getUser(id);
        return user;
    }
    private void printAll(){
        ss = ssf.openSession();
        IUserDao userDao = ss.getMapper(IUserDao.class);

        List<User> userList = userDao.findAll();
        for(User user : userList){
            System.out.println(user);
        }


    }


}
