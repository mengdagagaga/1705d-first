package com.zmd.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.zmd.jcartadministrationback.dto.in.OrderSearchInDTO;
import com.zmd.jcartadministrationback.dto.out.OrderListOutDTO;
import com.zmd.jcartadministrationback.dto.out.OrderShowOutDTO;
import com.zmd.jcartadministrationback.po.Order;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/6 14:34
 */
public interface OrderService {
    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO, Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);
}
