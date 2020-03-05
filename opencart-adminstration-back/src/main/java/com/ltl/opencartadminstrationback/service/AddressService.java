package com.ltl.opencartadminstrationback.service;


import com.ltl.opencartadminstrationback.po.Address;

import java.util.List;

public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

}
