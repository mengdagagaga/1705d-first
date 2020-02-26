package com.zmd.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import com.zmd.jcartadministrationback.dto.out.ProductListOutDTO;
import com.zmd.jcartadministrationback.po.ProductDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    ProductDetail selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKeyWithBLOBs(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);

    //    custom

    int batchDelete(@Param("productIds") List<Integer> productIds);



}