package com.ltl.opencartadminstrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ltl.opencartadminstrationback.dao.OrderDetailMapper;
import com.ltl.opencartadminstrationback.dao.OrderMapper;
import com.ltl.opencartadminstrationback.dto.out.OrderListOutDTO;
import com.ltl.opencartadminstrationback.dto.out.OrderShowOutDTO;
import com.ltl.opencartadminstrationback.po.Order;
import com.ltl.opencartadminstrationback.po.OrderDetail;
import com.ltl.opencartadminstrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Page<OrderListOutDTO> search(Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<OrderListOutDTO> page = orderMapper.search();
        return page;
    }
}
