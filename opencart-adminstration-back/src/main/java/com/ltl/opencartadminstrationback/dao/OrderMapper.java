package com.ltl.opencartadminstrationback.dao;

import com.github.pagehelper.Page;
import com.ltl.opencartadminstrationback.dto.out.OrderListOutDTO;
import com.ltl.opencartadminstrationback.po.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //    custom

    Page<OrderListOutDTO> search(@Param("orderId") Long orderId,
                                 @Param("status") Byte status,
                                 @Param("totalPrice") Double totalPrice,
                                 @Param("customerName") String customerName,
                                 @Param("startTime") Date startTime,
                                 @Param("endTime") Date endTime);
}