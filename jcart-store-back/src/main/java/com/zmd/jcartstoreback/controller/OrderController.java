package com.zmd.jcartstoreback.controller;

import com.zmd.jcartstoreback.dto.in.OrderProductInDTO;
import com.zmd.jcartstoreback.dto.out.OrderListOutDTO;
import com.zmd.jcartstoreback.dto.out.OrderShowOutDTO;
import com.zmd.jcartstoreback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 16:52
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @PostMapping("/checkout")
    public Integer checkout(List<OrderProductInDTO> orderProducts, Integer customerId){
        return null;
    }

    @GetMapping("/getMyWithPage")
    public PageOutDTO<OrderListOutDTO> getMyWithPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                                     Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Integer orderId){
        return null;
    }
}
