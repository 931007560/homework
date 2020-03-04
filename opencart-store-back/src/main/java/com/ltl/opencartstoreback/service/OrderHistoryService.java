package com.ltl.opencartstoreback.service;


import com.ltl.opencartstoreback.po.OrderHistory;

import java.util.List;

public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}
