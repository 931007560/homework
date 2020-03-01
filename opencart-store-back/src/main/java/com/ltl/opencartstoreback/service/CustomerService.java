package com.ltl.opencartstoreback.service;


import com.ltl.opencartstoreback.dto.in.CustomerRegisterInDTO;
import com.ltl.opencartstoreback.po.Customer;

public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);

}
