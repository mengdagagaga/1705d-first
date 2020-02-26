package com.zmd.jcartadministrationback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 16:53
 */
public class AdministratorLoginInDTO {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
