package com.ltl.opencartadminstrationback.controller;

import com.ltl.opencartadminstrationback.dto.in.OrderHistoryCreateInDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderhistory")
public class OrderHistoryController {

    /** @Author ltl
     * @Description //TODO
     * @Date 16:59 2020/2/24
     * @Param [orderHistoryCreateInDTO]
     * @return java.lang.Integer
     **/
    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        return null;
    }
}
