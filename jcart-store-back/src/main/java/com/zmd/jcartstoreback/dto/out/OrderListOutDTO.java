package com.zmd.jcartstoreback.dto.out;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 16:53
 */
public class OrderListOutDTO {

    private Long orderId;
    //todo add order list total products
//    private Integer totalProducts;
    private Byte status;
    private Double totalPrice;
    private Long createTimestamp;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}
