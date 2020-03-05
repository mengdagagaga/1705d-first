package com.zmd.jcartstoreback.service;

import com.zmd.jcartstoreback.dto.in.OrderCheckoutInDTO;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/4 14:59
 */
public interface OrderService {


    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO, Integer customerId);
}
