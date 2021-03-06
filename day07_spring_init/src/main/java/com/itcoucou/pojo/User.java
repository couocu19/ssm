package com.itcoucou.pojo;


import java.text.SimpleDateFormat;
import java.util.Date;

//user中的信息一定要和数据库中的信息一一对应
public class User {

    private int id;
    private String uasename;
    private Date birthday;
    SimpleDateFormat temp = new SimpleDateFormat("yyyy年MM月dd日");
    private String sex;
    private String address;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUasename() {
        return uasename;
    }
    public void setUasename(String uasename) {
        this.uasename = uasename;
    }
    public String getBirthday() {
        String date ;
        date = temp.format(birthday);
        return date;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getUasename()+",性别： "+getSex()+", 生日:"+getBirthday()+", Ta在"+getAddress();
    }
}
