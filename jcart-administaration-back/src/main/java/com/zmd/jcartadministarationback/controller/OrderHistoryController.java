package com.zmd.jcartadministarationback.controller;

import com.zmd.jcartadministarationback.dto.in.OrderHistoryCreateInDTO;
import com.zmd.jcartadministarationback.dto.out.OrderHistoryListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:30
 */
@RestController
@RequestMapping("/orderhistory")
public class OrderHistoryController {


    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId){
        return null;
    }


    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){
        return null;
    }



}
