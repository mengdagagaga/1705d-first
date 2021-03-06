package com.zmd.jcartadministrationback.dto.out;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 17:20
 */
public class PageOutDTO<T> {

    private Long total;
    private Integer pageNum;
    private Integer pageSize;
    private List<T> list;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
