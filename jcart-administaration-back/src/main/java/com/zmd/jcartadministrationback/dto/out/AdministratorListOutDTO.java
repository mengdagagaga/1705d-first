package com.zmd.jcartadministrationback.dto.out;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 17:39
 */
public class AdministratorListOutDTO {


    private Integer administratorId;
    private String username;
    private Byte status;
    private Long createTimestamp;

    public Integer getAdministratorId() {
        return administratorId;
    }

    public void setAdministratorId(Integer administratorId) {
        this.administratorId = administratorId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}
