package com.dao;

import com.pojo.Country;
import com.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    //通过list实现批量注入
    //注意要在注解中加上对应在sql语句中的参数名
    void addByList(@Param("countries") List<Country> list);

    //通过Map类型更新数据

    void updateByMap(Map<String,Object> map);


}
