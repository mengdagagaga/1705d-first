package com.zmd.jcartadministrationback.service;

import com.zmd.jcartadministrationback.po.OrderHistory;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/6 15:13
 */
public interface OrderHistoryService {


    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);
}
