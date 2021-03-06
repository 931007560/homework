package com.ltl.opencartadminstrationback.dao;

import com.github.pagehelper.Page;
import com.ltl.opencartadminstrationback.dto.in.ProductSearchInDTO;
import com.ltl.opencartadminstrationback.dto.out.ProductListOutDTO;
import com.ltl.opencartadminstrationback.po.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    int batchDelete(@Param("productIds") List<Integer> productIds);

    Page<ProductListOutDTO> search(@Param("productCode") String productCode,
                                   @Param("status") Byte status,
                                   @Param("stockQuantity") Integer stockQuantity,
                                   @Param("price") Double price,
                                   @Param("productName") String productName);

}