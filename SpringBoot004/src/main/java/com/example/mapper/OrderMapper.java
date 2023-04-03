package com.example.mapper;

import com.example.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    Integer add(@Param("order1") Order order);
    Integer del(Integer uid);
    Integer update(@Param("oreer2") Order order);
    Order findById(Integer uid);



}
