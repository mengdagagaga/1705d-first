package com.zmd.jcartstoreback.service;

import com.zmd.jcartstoreback.po.OrderHistory;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/5 19:43
 */
public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}
