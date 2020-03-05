package com.ltl.opencartadminstrationback.service;

import com.github.pagehelper.Page;
import com.ltl.opencartadminstrationback.dto.out.OrderListOutDTO;
import com.ltl.opencartadminstrationback.dto.out.OrderShowOutDTO;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

}
