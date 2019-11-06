package com.dao;

import com.pojo.Country;
import com.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountryDao {

    List<Country> getAll();
    Country getCountry(int id);
    List<Country> selectView(@Param("cityName") String city, @Param("cityView") String view);

    //根据城市名称进行模糊查询
    List<Country> getByName(String name);

    List<Country> findByVo(QueryVo vo);

    //使用if条件语句查询
    List<Country> findByCondition(Country country);

    List<Country> findInIds(QueryVo vo);


}
