package com.ltl.opencartstoreback.service;

import com.github.pagehelper.Page;
import com.ltl.opencartstoreback.po.Return;

public interface ReturnService {

    Integer create(Return aReturn);

    Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum);

    Return getById(Integer returnId);

}
