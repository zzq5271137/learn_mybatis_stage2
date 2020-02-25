package com.mycomp.mybatis.mapper;

import com.mycomp.mybatis.domain.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/*
 * 参数相关
 */

public interface ICustomerMapper {

    /*
     * 根据id查询用户
     */
    // @Param注解标注参数:
    Customer getCustomerById(@Param("id") Integer id, @Param("name") String name);

    // Map参数
    Customer getCustomerById(Map<String, Object> paramMap);

    // POJO参数
    Customer getCustomerById(Customer customer);

}
