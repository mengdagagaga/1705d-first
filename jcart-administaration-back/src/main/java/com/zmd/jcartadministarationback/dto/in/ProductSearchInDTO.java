package com.zmd.jcartadministarationback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 13:44
 */
public class ProductSearchInDTO {
    private String productCode;
    private String productName;
    private Double price;
    private Integer stockQuantity;
    private Byte status;


    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
