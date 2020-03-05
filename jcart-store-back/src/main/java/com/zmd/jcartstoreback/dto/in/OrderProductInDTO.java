package com.zmd.jcartstoreback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 16:53
 */
public class OrderProductInDTO {

    private Integer productId;
    private Integer quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
