package com.zmd.jcartadministarationback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:13
 */
public class OrderSearchInDTO {

    private Integer orderId;
    private String customerName;
    private Byte status;
    private Double totalPrice;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
}
