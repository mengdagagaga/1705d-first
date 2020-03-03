package com.zmd.jcartadministrationback.dto.out;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/3 20:12
 */
public class AdministratorLoginOutDTO {

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
