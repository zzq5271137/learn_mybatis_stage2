package com.mycomp.mybatis.test;

import com.mycomp.mybatis.domain.Customer;
import com.mycomp.mybatis.mapper.ICustomerMapper;
import com.mycomp.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;

public class MyTest {

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.openSession();
        ICustomerMapper mapper = sqlSession.getMapper(ICustomerMapper.class);

        Customer customer = mapper.getCustomerById(1, "鲁班");
        System.out.println(customer);

        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.openSession();
        ICustomerMapper mapper = sqlSession.getMapper(ICustomerMapper.class);

        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("id", 1);
        paramMap.put("name", "鲁班");
        Customer customer = mapper.getCustomerById(paramMap);
        System.out.println(customer);

        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = MybatisUtils.openSession();
        ICustomerMapper mapper = sqlSession.getMapper(ICustomerMapper.class);

        Customer customer = new Customer();
        customer.setCust_id(1);
        customer.setCust_name("鲁班");
        Customer customerRes = mapper.getCustomerById(customer);
        System.out.println(customerRes);

        sqlSession.close();
    }

}
