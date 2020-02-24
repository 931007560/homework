package com.ltl.opencartadminstrationback.controller;


import com.ltl.opencartadminstrationback.dto.out.CustomerListOutDTO;
import com.ltl.opencartadminstrationback.dto.out.CustomerShowOutDTO;
import com.ltl.opencartadminstrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    /** @Author ltl
     * @Description //TODO
     * @Date 16:05 2020/2/24
     * @Param [username, realName, mobile, email, status, createTimestamp, pageNum]
     * @return com.ltl.opencartadminstrationback.dto.out.PageOutDTO<com.ltl.opencartadminstrationback.dto.out.CustomerListOutDTO>
     **/
    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(@RequestParam(required = false) String username,
                                                 @RequestParam(required = false) String realName,
                                                 @RequestParam(required = false) String mobile,
                                                 @RequestParam(required = false) String email,
                                                 @RequestParam(required = false) Byte status,
                                                 @RequestParam(required = false) Long createTimestamp,
                                                 @RequestParam(required = false, defaultValue = "1") Integer pageNum){

        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:07 2020/2/24
     * @Param [customerId]
     * @return com.ltl.opencartadminstrationback.dto.out.CustomerShowOutDTO
     **/
    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

}
