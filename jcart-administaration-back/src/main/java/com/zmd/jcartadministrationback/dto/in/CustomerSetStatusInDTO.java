package com.zmd.jcartadministrationback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/5 20:15
 */
public class CustomerSetStatusInDTO {
    private Integer customerId;
    private Byte status;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
