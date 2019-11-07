package com.pojo;

import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private int uid;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account(int id, int uid, double money) {
        this.id = id;
        this.uid = uid;
        this.money = money;
    }

    public Account(){

    }

    public Account(int uid, double money) {
        this.uid = uid;
        this.money = money;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }
}
