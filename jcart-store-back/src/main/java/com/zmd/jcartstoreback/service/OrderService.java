package com.zmd.jcartstoreback.service;

import com.github.pagehelper.Page;
import com.zmd.jcartstoreback.dto.in.OrderCheckoutInDTO;
import com.zmd.jcartstoreback.dto.out.OrderShowOutDTO;
import com.zmd.jcartstoreback.po.Order;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/4 14:59
 */
public interface OrderService {


    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);
}
