package com.ltl.opencartstoreback.dao;

import com.github.pagehelper.Page;
import com.ltl.opencartstoreback.po.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);


    Page<Order> selectByCustomerId(@Param("customerId") Integer customerId);
}