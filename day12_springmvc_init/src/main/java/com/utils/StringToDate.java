package com.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 *把字符串转换为日期
 */
public class StringToDate implements Converter<String, Date>{

    /**
     * 传入一个字符串并将其转换为Date类型
     * @param s
     * @return
     */
    @Override
    public Date convert(String s) {
        if(s == null){
            throw new RuntimeException("请您传入数据");
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换出现错误");
        }

    }
}
