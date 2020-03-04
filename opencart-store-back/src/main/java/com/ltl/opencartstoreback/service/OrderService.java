package com.ltl.opencartstoreback.service;

import com.github.pagehelper.Page;
import com.ltl.opencartstoreback.dto.in.OrderCheckoutInDTO;
import com.ltl.opencartstoreback.dto.out.OrderShowOutDTO;
import com.ltl.opencartstoreback.po.Order;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
