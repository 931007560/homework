package com.ltl.opencartadminstrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ltl.opencartadminstrationback.dao.OrderDetailMapper;
import com.ltl.opencartadminstrationback.dao.OrderMapper;
import com.ltl.opencartadminstrationback.dto.in.OrderSearchInDTO;
import com.ltl.opencartadminstrationback.dto.out.OrderListOutDTO;
import com.ltl.opencartadminstrationback.dto.out.OrderShowOutDTO;
import com.ltl.opencartadminstrationback.po.Order;
import com.ltl.opencartadminstrationback.po.OrderDetail;
import com.ltl.opencartadminstrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    public Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<OrderListOutDTO> page = orderMapper
                .search(orderSearchInDTO.getOrderId(),
                        orderSearchInDTO.getStatus(),
                        orderSearchInDTO.getTotalPrice(),
                        orderSearchInDTO.getCustomerName(),
                        orderSearchInDTO.getStartTimestamp() == null ? null : new Date(orderSearchInDTO.getStartTimestamp()),
                        orderSearchInDTO.getEndTimestamp() == null ? null : new Date(orderSearchInDTO.getEndTimestamp()));
        return page;
    }

    @Override
    public OrderShowOutDTO getById(Long orderId) {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        OrderDetail orderDetail = orderDetailMapper.selectByPrimaryKey(orderId);

        OrderShowOutDTO orderShowOutDTO = new OrderShowOutDTO();
        orderShowOutDTO.setOrderId(orderId);
        orderShowOutDTO.setCustomerId(order.getCustomerId());

        return orderShowOutDTO;
    }
}
