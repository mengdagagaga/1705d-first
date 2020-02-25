package com.zmd.jcartstoreback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 16:20
 */
public class CustomerResetPwdInDTO {
    private String email;
    private String resetCode;
    private String newPwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResetCode() {
        return resetCode;
    }

    public void setResetCode(String resetCode) {
        this.resetCode = resetCode;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }
}
