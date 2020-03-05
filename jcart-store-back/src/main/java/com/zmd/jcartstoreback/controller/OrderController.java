package com.zmd.jcartstoreback.controller;

import com.zmd.jcartstoreback.dto.in.OrderCheckoutInDTO;
import com.zmd.jcartstoreback.dto.out.OrderListOutDTO;
import com.zmd.jcartstoreback.dto.out.OrderShowOutDTO;
import com.zmd.jcartstoreback.dto.out.PageOutDTO;
import com.zmd.jcartstoreback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 16:52
 */
@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public Long checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        Long orderId = orderService.checkout(orderCheckoutInDTO, customerId);
        return orderId;
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
