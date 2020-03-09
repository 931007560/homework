package com.ltl.opencartadminstrationback.service;

import com.github.pagehelper.Page;
import com.ltl.opencartadminstrationback.dto.in.CustomerSearchInDTO;
import com.ltl.opencartadminstrationback.dto.in.CustomerSetStatusInDTO;
import com.ltl.opencartadminstrationback.po.Customer;

public interface CustomerService {

    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

}
