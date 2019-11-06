package com.dao;

import com.pojo.Country;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountryDao {

    List<Country> getAll();

    //向数据库中插入数据并返回主键
    int addCountry(Country c);
    //通过主键删除
    int deleteCountry(int id);
    int updateCountry(Country country);
    Country getCountry(int id);

    List<Country> selectView(@Param("cityName")String city,@Param("cityView") String view);
}
