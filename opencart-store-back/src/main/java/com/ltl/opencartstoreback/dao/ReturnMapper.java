package com.ltl.opencartstoreback.dao;

import com.github.pagehelper.Page;
import com.ltl.opencartstoreback.po.Return;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);

//    custom

    Page<Return> selectPageByCustomerId(@Param("customerId") Integer customerId);
}