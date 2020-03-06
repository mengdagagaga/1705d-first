package com.zmd.jcartadministrationback.service.impl;

import com.zmd.jcartadministrationback.dao.OrderHistoryMapper;
import com.zmd.jcartadministrationback.po.Order;
import com.zmd.jcartadministrationback.po.OrderHistory;
import com.zmd.jcartadministrationback.service.OrderHistoryService;
import com.zmd.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    @Autowired
    private OrderService orderService;

    @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
        List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);
        return orderHistories;
    }

    @Override
    public Long create(OrderHistory orderHistory) {
        orderHistoryMapper.insertSelective(orderHistory);
        Order order = new Order();
        order.setOrderId(orderHistory.getOrderId());
        order.setStatus(orderHistory.getOrderStatus());
        order.setUpdateTime(new Date());
        orderService.update(order);
        Long orderHistoryId =orderHistory.getOrderHistoryId();
        return orderHistoryId;
    }
}
