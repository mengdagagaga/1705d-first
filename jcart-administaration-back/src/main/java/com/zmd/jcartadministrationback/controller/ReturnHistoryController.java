package com.zmd.jcartadministrationback.controller;

import com.zmd.jcartadministrationback.dto.in.ReturnHistoryCreateInDTO;
import com.zmd.jcartadministrationback.dto.out.ReturnHistoryListOutDTO;
import com.zmd.jcartadministrationback.po.ReturnHistory;
import com.zmd.jcartadministrationback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:56
 */
@RestController
@RequestMapping("/returnhistory")
@CrossOrigin
public class ReturnHistoryController {

    @Autowired
    private ReturnHistoryService returnHistoryService;


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
            //todo send notification to customer
        }

        return returnHistoryId;

    }




}
