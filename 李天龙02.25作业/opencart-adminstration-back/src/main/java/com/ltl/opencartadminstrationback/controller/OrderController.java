package com.ltl.opencartadminstrationback.controller;


import com.ltl.opencartadminstrationback.dto.out.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    /** @Author ltl
     * @Description //TODO
     * @Date 16:55 2020/2/24
     * @Param [orderId, username, status, totalPrice, createTime, updateTime, pageNum]
     * @return com.ltl.opencartadminstrationback.dto.out.PageOutDTO<com.ltl.opencartadminstrationback.dto.out.OrderListOutDTO>
     **/
    @GetMapping("search")
    public PageOutDTO<OrderListOutDTO> search(@RequestParam(required = false) Integer orderId,
                                              @RequestParam(required = false) String username,
                                              @RequestParam(required = false) Integer status,
                                              @RequestParam(required = false) Double totalPrice,
                                              @RequestParam(required = false) Long createTime,
                                              @RequestParam(required = false) Long updateTime,
                                              @RequestParam(required = false,defaultValue = "1") Integer pageNum){
        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:57 2020/2/24
     * @Param [orderId]
     * @return com.ltl.opencartadminstrationback.dto.out.OrderShowOutDTO
     **/
    @GetMapping("getById")
    public OrderShowOutDTO getById(@RequestParam Integer orderId){

        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:57 2020/2/24
     * @Param [orderId]
     * @return com.ltl.opencartadminstrationback.dto.out.OrderInvoiceOutDTO
     **/
    @GetMapping("/getInvoiceByOrderId")
    public OrderInvoiceOutDTO getInvoiceByOrderId(@RequestParam Long orderId){
        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:59 2020/2/24
     * @Param [orderId]
     * @return com.ltl.opencartadminstrationback.dto.out.OrderShipOutDTO
     **/
    @GetMapping("/getShipByOrderId")
    public OrderShipOutDTO getShipByOrderId(@RequestParam Long orderId){
        return null;
    }
}
