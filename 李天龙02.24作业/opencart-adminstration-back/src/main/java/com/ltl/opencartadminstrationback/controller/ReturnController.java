package com.ltl.opencartadminstrationback.controller;


import com.ltl.opencartadminstrationback.dto.out.PageOutDTO;
import com.ltl.opencartadminstrationback.dto.out.ReturnListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/return")
public class ReturnController {

    /** @Author ltl
     * @Description //TODO
     * @Date 16:55 2020/2/24
     * @Param [returnid, orderid, realname, status, returnaction, productname, createTime, updateTime, pageNum]
     * @return com.ltl.opencartadminstrationback.dto.out.PageOutDTO<com.ltl.opencartadminstrationback.dto.out.ReturnListOutDTO>
     **/
    @GetMapping("search")
    public PageOutDTO<ReturnListOutDTO> search(@RequestParam(required = false) Integer returnid,
                                               @RequestParam(required = false) Integer orderid,
                                               @RequestParam(required = false) String realname,
                                               @RequestParam(required = false) Integer status,
                                               @RequestParam(required = false) Integer returnaction,
                                               @RequestParam(required = false) String productname,
                                               @RequestParam(required = false) Long createTime,
                                               @RequestParam(required = false) Long updateTime,
                                               @RequestParam(required = false,defaultValue = "1") Integer pageNum){
        return null;
    }


}
