package com.ltl.opencartstoreback.dao;

import com.ltl.opencartstoreback.po.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);


//    custom
    List<Address> selectByCustomerId(@Param("customerId") Integer customerId);
}