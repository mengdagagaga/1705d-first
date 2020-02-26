package com.zmd.jcartadministrationback.dto.out;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:57
 */
public class ReturnHistoryListOutDTO {

    private Integer returnHistoryId;
    private Long timestamp;
    private Byte returnStatus;
    private String comment;
    private Byte customerNotified;

    public Integer getReturnHistoryId() {
        return returnHistoryId;
    }

    public void setReturnHistoryId(Integer returnHistoryId) {
        this.returnHistoryId = returnHistoryId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Byte getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Byte returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Byte getCustomerNotified() {
        return customerNotified;
    }

    public void setCustomerNotified(Byte customerNotified) {
        this.customerNotified = customerNotified;
    }
}
