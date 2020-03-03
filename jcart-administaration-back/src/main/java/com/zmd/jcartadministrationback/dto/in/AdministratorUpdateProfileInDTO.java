package com.zmd.jcartadministrationback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 17:00
 */
public class AdministratorUpdateProfileInDTO {
    private String realName;
    private String email;
    private String avatarUrl;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

}
