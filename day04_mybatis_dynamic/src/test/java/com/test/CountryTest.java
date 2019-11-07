package com.test;

import com.dao.CountryDao;
import com.pojo.Country;
import com.pojo.QueryVo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryTest extends BaseMapperTest {
    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try {
            List<Country> list = sqlSession.selectList("com.dao.CountryDao.getAll");
            printList(list);
        } finally {
            //不要忘记关闭sqlSession
            sqlSession.close();
        }

    }
    @Test
    public void testGetById(){
        SqlSession session = getSqlSession();

        try {
            CountryDao countryDao = session.getMapper(CountryDao.class);
            Country country = countryDao.getCountry(1);
            System.out.println(country.getCityName()+"-->"+country.getCityView());
        } finally {
            session.close();
        }


    }

    @Test
    public void testSelectView(){
        SqlSession session = getSqlSession();
        CountryDao countryDao = session.getMapper(CountryDao.class);

        List<Country> list = countryDao.selectView("北京","天坛");
        printList(list);


    }

    @Test
    public void testGetByName(){
        SqlSession session = getSqlSession();

        try {
            CountryDao countryDao = session.getMapper(CountryDao.class);
            List<Country> list = countryDao.getByName("%北%");
            printList(list);
        } finally {
            session.close();
        }

    }

    @Test
    public void testGetByVo(){
        SqlSession session = getSqlSession();
        CountryDao countryDao = session.getMapper(CountryDao.class);
        try {
            QueryVo vo = new QueryVo();
            Country country = new Country();
            country.setCityName("%京%");
            //将包装好的实体类和javaBean联系起来
            vo.setCountry(country);
            List<Country> result = countryDao.findByVo(vo);

            printList(result);
        } finally {
            session.close();
        }

    }

    @Test
    public void testFindByCondition(){
        SqlSession session = getSqlSession();
        try {
            CountryDao countryDao = session.getMapper(CountryDao.class);
            Country country = new Country();
            country.setCityName("北京");
           // country.setCityView("故宫");
            List<Country> result = countryDao.findByCondition(country);
            printList(result);
        } finally {
            session.close();
        }


    }

    @Test
    public void testFindInIds(){
        SqlSession session = getSqlSession();
        CountryDao countryDao = session.getMapper(CountryDao.class);

        QueryVo vo = new QueryVo();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        //ids.add(8);
        //ids.add(9);
       // ids.add(10);
        vo.setIds(ids);
        List<Country> list = countryDao.findInIds(vo);
        printList(list);

    }

    @Test
    public void testInsertByList(){
        SqlSession session = getSqlSession();
        try {
            CountryDao countryDao = session.getMapper(CountryDao.class);
            //QueryVo vo = new QueryVo();
            List<Country> countries = new ArrayList<Country>();
            Country c1 = new Country("上海","迪士尼乐园");
            Country c2 = new Country("西安","兵马俑");
            countries.add(c1);
            countries.add(c2);
            countryDao.addByList(countries);

        } finally {
            session.commit();
            session.close();
        }


    }


    @Test
    public void testUpdateByMap(){
        SqlSession session = getSqlSession();
        try {
            CountryDao countryDao = session.getMapper(CountryDao.class);

            Map<String,Object> map = new HashMap<String, Object>();
            //查询条件同样是更新字段，必须保证该值存在
            map.put("id",11);
            //要更新的其它字段
            map.put("city_view","清华大学");
            session.commit();
            //更新数据
            countryDao.updateByMap(map);
            Country country = countryDao.getCountry(11);
            System.out.println(country.getCityView());

        } finally {
            session.close();
        }


    }

    private void printList(List<Country> list){
        for(Country country:list){
            System.out.println(country.getId()+": "+country.getCityName()+"-->"+country.getCityView());
        }

    }






}
