package com.test;

import com.dao.CountryDao;
import com.pojo.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;


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
    public void testInsert(){
        SqlSession session = getSqlSession();
        try {
            CountryDao countryDao = session.getMapper(CountryDao.class);
            Country country = new Country();
            country.setCityName("北京");
            country.setCityView("天坛");
            int result = countryDao.addCountry(country);
            //只插入一条数据
            Assert.assertEquals(1,result);
            //id为null,没有给id赋值，并且没有配置回写id的值
//            Assert.assertNull(country.getId());
        } finally {
            //默认的sqlSessionFactory.openSession()不会自定提交到数据库
            //该方法会将结果自动提交到数据库
            session.commit();
            //为了不影响其他测试，这里选择回滚,即只将数据存在session中,不将其上传到数据库
            // session.rollback();
            //不要忘记关闭
            session.close();
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
    public void testUpdate(){
        SqlSession session = getSqlSession();
        try {
            CountryDao countryDao = session.getMapper(CountryDao.class);
            //从数据库查询1个user对象
            Country country = countryDao.getCountry(1);
            //当前城市名为北京
            Assert.assertEquals("北京",country.getCityName());
            //修改用户名
            country.setCityView("天安门");
           //只更新一条数据
            int result = countryDao.updateCountry(country);
            Assert.assertEquals(1,result);
             country = countryDao.getCountry(1);
            //System.out.println(country.getCityName());
            Assert.assertEquals("天安门",country.getCityView());
          //  System.out.println(country.getCityView());
        } finally {
            session.rollback();
            session.close();
        }
    }
    @Test
    public void testDelete(){
        SqlSession session = getSqlSession();
        try {
            CountryDao countryDao = session.getMapper(CountryDao.class);
            Country country = countryDao.getCountry(2);
            Assert.assertNotNull(country);
            Assert.assertEquals(1,countryDao.deleteCountry(2));
            System.out.println(countryDao.deleteCountry(2));
            //Assert.assertNull(country);
        } finally {
            session.rollback();
            session.close();
        }
        // countryDao.deleteCountry(1);

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

}
