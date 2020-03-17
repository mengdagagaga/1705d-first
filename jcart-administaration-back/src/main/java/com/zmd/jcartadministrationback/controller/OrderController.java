package com.zmd.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import com.zmd.jcartadministrationback.dto.in.OrderSearchInDTO;
import com.zmd.jcartadministrationback.dto.out.*;
import com.zmd.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:09
 */
@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                              @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        Page<OrderListOutDTO> page = orderService.search(orderSearchInDTO,pageNum);
        PageOutDTO<OrderListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);
        return pageOutDTO;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        OrderShowOutDTO orderShowOutDTO = orderService.getById(orderId);
        return orderShowOutDTO;
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
