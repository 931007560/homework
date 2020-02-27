package com.ltl.opencartadminstrationback.controller;

import com.ltl.opencartadminstrationback.dto.in.ReturnHistoryCreateInDTO;
import com.ltl.opencartadminstrationback.dto.out.ReturnHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/returnhistory")
public class ReturnHistoryController {
    /** @Author ltl
     * @Description //TODO
     * @Date 16:28 2020/2/25
     * @Param [returnId]
     * @return java.util.List<com.ltl.opencartadminstrationback.dto.out.ReturnHistoryListOutDTO>
     **/
    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(@RequestParam Integer returnId){

        return null;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:29 2020/2/25
     * @Param [returnHistoryCreateInDTO]
     * @return java.lang.Integer
     **/
    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){

        return null;
    }

}
