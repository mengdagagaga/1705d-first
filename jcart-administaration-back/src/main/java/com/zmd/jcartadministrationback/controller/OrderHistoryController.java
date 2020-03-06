package com.zmd.jcartadministrationback.controller;

import com.zmd.jcartadministrationback.dto.in.OrderHistoryCreateInDTO;
import com.zmd.jcartadministrationback.dto.out.OrderHistoryListOutDTO;
import com.zmd.jcartadministrationback.po.OrderHistory;
import com.zmd.jcartadministrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:30
 */
@RestController
@RequestMapping("/orderhistory")
@CrossOrigin
public class OrderHistoryController {

    @Autowired
    private OrderHistoryService orderHistoryService;

    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId){
        List<OrderHistory> orderHistories = orderHistoryService.getByOrderId(orderId);


        return null;
    }


    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        return null;
    }



}
