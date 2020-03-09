package com.ltl.opencartadminstrationback.controller;


import com.github.pagehelper.Page;
import com.ltl.opencartadminstrationback.dto.in.CustomerSearchInDTO;
import com.ltl.opencartadminstrationback.dto.in.CustomerSetStatusInDTO;
import com.ltl.opencartadminstrationback.dto.out.CustomerListOutDTO;
import com.ltl.opencartadminstrationback.dto.out.CustomerShowOutDTO;
import com.ltl.opencartadminstrationback.dto.out.PageOutDTO;
import com.ltl.opencartadminstrationback.po.Address;
import com.ltl.opencartadminstrationback.po.Customer;
import com.ltl.opencartadminstrationback.service.AddressService;
import com.ltl.opencartadminstrationback.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AddressService addressService;

    /** @Author ltl
     * @Description //TODO
     * @Date 15:51 2020/3/5
     * @Param [customerSearchInDTO, pageNum]
     * @return com.ltl.opencartadminstrationback.dto.out.PageOutDTO<com.ltl.opencartadminstrationback.dto.out.CustomerListOutDTO>
     **/
    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        Page<Customer> page = customerService.search(customerSearchInDTO,pageNum);
        List<CustomerListOutDTO> customerListOutDTOS = page.stream().map(customer -> {
            CustomerListOutDTO customerListOutDTO = new CustomerListOutDTO();
            customerListOutDTO.setCustomerId(customer.getCustomerId());
            customerListOutDTO.setUsername(customer.getUsername());
            customerListOutDTO.setRealName(customer.getRealName());
            customerListOutDTO.setMobile(customer.getMobile());
            customerListOutDTO.setEmail(customer.getEmail());
            customerListOutDTO.setStatus(customer.getStatus());
            customerListOutDTO.setCreateTimestamp(customer.getCreateTime().getTime());
            return customerListOutDTO;
        }).collect(Collectors.toList());

        PageOutDTO<CustomerListOutDTO> pageOutDTO = new PageOutDTO<>();

        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(customerListOutDTOS);

        return pageOutDTO;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:07 2020/2/24
     * @Param [customerId]
     * @return com.ltl.opencartadminstrationback.dto.out.CustomerShowOutDTO
     **/
    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        Customer customer = customerService.getById(customerId);

        CustomerShowOutDTO customerShowOutDTO = new CustomerShowOutDTO();
        customerShowOutDTO.setCustomerId(customerId);
        customerShowOutDTO.setUsername(customer.getUsername());
        customerShowOutDTO.setRealName(customer.getRealName());
        customerShowOutDTO.setMobile(customer.getMobile());
        customerShowOutDTO.setEmail(customer.getEmail());
        customerShowOutDTO.setAvatarUrl(customer.getAvatarUrl());
        customerShowOutDTO.setStatus(customer.getStatus());
        customerShowOutDTO.setRewordPoints(customer.getRewordPoints());
        customerShowOutDTO.setNewsSubscribed(customer.getNewsSubscribed());
        customerShowOutDTO.setCreateTimestamp(customer.getCreateTime().getTime());
        customerShowOutDTO.setDefaultAddressId(customer.getDefaultAddressId());

        Address defaultAddress = addressService.getById(customer.getDefaultAddressId());
        if (defaultAddress != null){
            customerShowOutDTO.setDefaultAddress(defaultAddress.getContent());
        }

        return customerShowOutDTO;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 15:52 2020/3/5
     * @Param [customerSetStatusInDTO]
     * @return void
     **/
    @PostMapping("/disable")
    public void disable(@RequestBody CustomerSetStatusInDTO customerSetStatusInDTO){

        customerService.setStatus(customerSetStatusInDTO);
    }

}
