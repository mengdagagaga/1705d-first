package com.zmd.jcartadministarationback.controller;

import com.zmd.jcartadministarationback.dto.in.OrderSearchInDTO;
import com.zmd.jcartadministarationback.dto.out.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:09
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                              @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long OrderId){
        return null;
    }

    @GetMapping("/getInvoice")
    public OrderInvoiceShowOutDTO getInvoice(@RequestParam Long OrderId){
        return null;
    }


    @GetMapping("/getShipInfo")
    public OrderShipShowOutDTO getShipInfo(@RequestParam Long OrderId){
        return null;
    }









}
