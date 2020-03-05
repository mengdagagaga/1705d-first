package com.zmd.jcartstoreback.controller;

import com.github.pagehelper.Page;
import com.zmd.jcartstoreback.dto.in.OrderCheckoutInDTO;
import com.zmd.jcartstoreback.dto.out.OrderListOutDTO;
import com.zmd.jcartstoreback.dto.out.OrderShowOutDTO;
import com.zmd.jcartstoreback.dto.out.PageOutDTO;
import com.zmd.jcartstoreback.po.Order;
import com.zmd.jcartstoreback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getMyWithPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                                     @RequestAttribute Integer customerId){
        Page<Order> page = orderService.getByCustomerId(pageNum, customerId);

        List<OrderListOutDTO> orderListOutDTOS = page.stream().map(order -> {
            OrderListOutDTO orderListOutDTO = new OrderListOutDTO();
            orderListOutDTO.setOrderId(order.getOrderId());
            orderListOutDTO.setStatus(order.getStatus());
            orderListOutDTO.setTotalPrice(order.getTotalPrice());
            orderListOutDTO.setCreateTimestamp(order.getCreateTime().getTime());
            return orderListOutDTO;

        }).collect(Collectors.toList());

        PageOutDTO<OrderListOutDTO> orderListOutDTOPageOutDTO = new PageOutDTO<>();
        orderListOutDTOPageOutDTO.setTotal(page.getTotal());
        orderListOutDTOPageOutDTO.setPageNum(page.getPageNum());
        orderListOutDTOPageOutDTO.setPageSize(page.getPageSize());
        orderListOutDTOPageOutDTO.setList(orderListOutDTOS);
        return orderListOutDTOPageOutDTO;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Integer orderId){
        return null;
    }
}
