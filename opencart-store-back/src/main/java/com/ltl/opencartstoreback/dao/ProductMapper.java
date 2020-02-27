package com.ltl.opencartstoreback.dao;

import com.github.pagehelper.Page;
import com.ltl.opencartstoreback.dto.out.ProductListOutDTO;
import com.ltl.opencartstoreback.po.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    //    custom

    Page<ProductListOutDTO> search();
}