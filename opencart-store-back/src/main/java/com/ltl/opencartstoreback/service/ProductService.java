package com.ltl.opencartstoreback.service;


import com.github.pagehelper.Page;
import com.ltl.opencartstoreback.dto.out.ProductListOutDTO;
import com.ltl.opencartstoreback.dto.out.ProductShowOutDTO;
import com.ltl.opencartstoreback.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
