package com.ltl.opencartadminstrationback.service;


import com.ltl.opencartadminstrationback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> getListByReturnId(Integer returnId);

    Long create(ReturnHistory returnHistory);

}
