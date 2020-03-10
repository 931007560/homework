package com.ltl.opencartadminstrationback.service;

import com.github.pagehelper.Page;
import com.ltl.opencartadminstrationback.dto.in.OrderSearchInDTO;
import com.ltl.opencartadminstrationback.dto.out.OrderListOutDTO;
import com.ltl.opencartadminstrationback.dto.out.OrderShowOutDTO;

public interface OrderService {

    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);
}
