package com.zmd.jcartadministarationback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:53
 */
public class ReturnUpdateActionInDTO {
    private Integer returnId;
    private Byte action;

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }
}
