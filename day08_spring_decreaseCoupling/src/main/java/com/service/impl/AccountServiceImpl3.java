package com.service.impl;

import com.service.AccountService;

import java.util.*;

public class AccountServiceImpl3 implements AccountService {

    //List结构型的集合类型
    private String[] strings;
    private List<String> list;
    private Set<String> set;

    //Map结构类型的集合类型
    private Map<String,String> map;
    private Properties properties;

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void saveAccount() {

    }

    @Override
    public String toString() {
        return "AccountServiceImpl3{" +
                "strings=" + Arrays.toString(strings) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
