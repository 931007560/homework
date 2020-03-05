package com.ltl.opencartadminstrationback.dao;

import com.github.pagehelper.Page;
import com.ltl.opencartadminstrationback.dto.out.OrderListOutDTO;
import com.ltl.opencartadminstrationback.po.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //    custom

    Page<OrderListOutDTO> search();
}