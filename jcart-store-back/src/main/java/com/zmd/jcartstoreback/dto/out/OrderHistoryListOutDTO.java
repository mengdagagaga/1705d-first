package com.zmd.jcartstoreback.dto.out;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/5 19:39
 */
public class OrderHistoryListOutDTO {

    private Long timestamp;
    private Byte orderStatus;
    private String comment;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
