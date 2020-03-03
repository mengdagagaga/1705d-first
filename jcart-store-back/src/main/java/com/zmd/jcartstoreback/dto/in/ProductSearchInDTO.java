package com.zmd.jcartstoreback.dto.in;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/3 13:30
 */
public class ProductSearchInDTO {

    private String keyword;
    private Byte sortBy;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Byte getSortBy() {
        return sortBy;
    }

    public void setSortBy(Byte sortBy) {
        this.sortBy = sortBy;
    }
}
