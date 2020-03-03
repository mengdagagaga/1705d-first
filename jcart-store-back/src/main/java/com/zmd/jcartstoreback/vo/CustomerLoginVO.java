package com.zmd.jcartstoreback.vo;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/3 13:50
 */
public class CustomerLoginVO {

    private Integer customerId;
    private String username;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
