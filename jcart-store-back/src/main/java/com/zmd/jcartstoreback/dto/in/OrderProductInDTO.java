package com.zmd.jcartstoreback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 16:53
 */
public class OrderProductInDTO {

    private Integer orderProductId;
    private Integer orderProductQuantity;

    public Integer getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(Integer orderProductId) {
        this.orderProductId = orderProductId;
    }

    public Integer getOrderProductQuantity() {
        return orderProductQuantity;
    }

    public void setOrderProductQuantity(Integer orderProductQuantity) {
        this.orderProductQuantity = orderProductQuantity;
    }
}
