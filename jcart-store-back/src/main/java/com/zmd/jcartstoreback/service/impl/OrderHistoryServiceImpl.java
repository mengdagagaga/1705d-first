package com.zmd.jcartstoreback.service.impl;

import com.zmd.jcartstoreback.dao.OrderHistoryMapper;
import com.zmd.jcartstoreback.po.OrderHistory;
import com.zmd.jcartstoreback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/5 19:44
 */
@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }
}
