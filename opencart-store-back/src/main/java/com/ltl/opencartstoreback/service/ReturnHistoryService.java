package com.ltl.opencartstoreback.service;


import com.ltl.opencartstoreback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getByReturnId(Integer returnId);
}
