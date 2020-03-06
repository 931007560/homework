package com.ltl.opencartstoreback.service.impl;

import com.ltl.opencartstoreback.dao.ReturnHistoryMapper;
import com.ltl.opencartstoreback.po.ReturnHistory;
import com.ltl.opencartstoreback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Override
    public List<ReturnHistory> getByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectByReturnId(returnId);
        return returnHistories;
    }
}
