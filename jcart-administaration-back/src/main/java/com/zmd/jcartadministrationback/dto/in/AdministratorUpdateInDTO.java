package com.zmd.jcartadministrationback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 17:37
 */
public class AdministratorUpdateInDTO {

    private String administratorId;
    private String realName;
    private String email;
    private String password;
    private Byte status;

    public String getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(String administratorId) {
        this.administratorId = administratorId;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
