package com.zmd.jcartstoreback.dto.out;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/3 13:43
 */
public class CustomerLoginOutDTO {

    private String token;
    private Long expireTimestamp;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getExpireTimestamp() {
        return expireTimestamp;
    }

    public void setExpireTimestamp(Long expireTimestamp) {
        this.expireTimestamp = expireTimestamp;
    }
}
