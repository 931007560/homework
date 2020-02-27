package com.ltl.opencartadminstrationback.controller;

import com.ltl.opencartadminstrationback.dto.in.OrderHistoryCreateInDTO;
import com.ltl.opencartadminstrationback.dto.out.OrderHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    /** @Author ltl
     * @Description //TODO
     * @Date 16:33 2020/2/25
     * @Param [orderId]
     * @return java.util.List<com.ltl.opencartadminstrationback.dto.out.OrderHistoryListOutDTO>
     **/
    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId){
        return null;
    }

}
