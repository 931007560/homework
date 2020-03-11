package com.ltl.opencartadminstrationback.controller;

import com.ltl.opencartadminstrationback.dto.in.ReturnHistoryCreateInDTO;
import com.ltl.opencartadminstrationback.dto.out.ReturnHistoryListOutDTO;
import com.ltl.opencartadminstrationback.po.ReturnHistory;
import com.ltl.opencartadminstrationback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/returnhistory")
@CrossOrigin
public class ReturnHistoryController {

    @Autowired
    private ReturnHistoryService returnHistoryService;

    /** @Author ltl
     * @Description //TODO
     * @Date 16:28 2020/3/11
     * @Param [returnId]
     * @return java.util.List<com.ltl.opencartadminstrationback.dto.out.ReturnHistoryListOutDTO>
     **/
    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryListOutDTO> getListByReturnId(@RequestParam Integer returnId){
        List<ReturnHistory> returnHistories = returnHistoryService.getListByReturnId(returnId);

        List<ReturnHistoryListOutDTO> returnHistoryListOutDTOS = returnHistories.stream().map(returnHistory -> {
            ReturnHistoryListOutDTO returnHistoryListOutDTO = new ReturnHistoryListOutDTO();
            returnHistoryListOutDTO.setReturnHistoryId(returnHistory.getReturnHistoryId());
            returnHistoryListOutDTO.setTimestamp(returnHistory.getTime().getTime());
            returnHistoryListOutDTO.setReturnStatus(returnHistory.getReturnStatus());
            returnHistoryListOutDTO.setComment(returnHistory.getComment());
            returnHistoryListOutDTO.setCustomerNotified(returnHistory.getCustomerNotified());
            return returnHistoryListOutDTO;
        }).collect(Collectors.toList());

        return returnHistoryListOutDTOS;
    }

    /** @Author ltl
     * @Description //TODO
     * @Date 16:29 2020/3/11
     * @Param [returnHistoryCreateInDTO]
     * @return java.lang.Integer
     **/
    @PostMapping("/create")
    public Long create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
        ReturnHistory returnHistory = new ReturnHistory();
        returnHistory.setReturnId(returnHistoryCreateInDTO.getReturnId());
        returnHistory.setTime(new Date());
        returnHistory.setReturnStatus(returnHistoryCreateInDTO.getReturnStatus());
        returnHistory.setComment(returnHistoryCreateInDTO.getComment());
        Boolean customerNotified = returnHistoryCreateInDTO.getCustomerNotified();
        returnHistory.setCustomerNotified(customerNotified);
        Long returnHistoryId = returnHistoryService.create(returnHistory);

        if (customerNotified != null && customerNotified){
            //发送通知
        }

        return returnHistoryId;
    }

}
