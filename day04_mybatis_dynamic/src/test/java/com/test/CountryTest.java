package com.test;

import com.dao.CountryDao;
import com.pojo.Country;
import com.pojo.QueryVo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
    private void printList(List<Country> list){
        for(Country country:list){
            System.out.println(country.getId()+": "+country.getCityName()+"-->"+country.getCityView());
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






}
