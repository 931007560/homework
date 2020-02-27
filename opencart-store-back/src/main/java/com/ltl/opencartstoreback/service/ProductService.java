package com.ltl.opencartstoreback.service;


import com.github.pagehelper.Page;
import com.ltl.opencartstoreback.dto.out.ProductListOutDTO;
import com.ltl.opencartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
