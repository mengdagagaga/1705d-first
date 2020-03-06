package com.zmd.jcartadministrationback.service.impl;

import com.zmd.jcartadministrationback.dao.OrderHistoryMapper;
import com.zmd.jcartadministrationback.po.OrderHistory;
import com.zmd.jcartadministrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/6 15:13
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
