package com.zmd.jcartadministrationback.service.impl;

import com.zmd.jcartadministrationback.dao.ProductDetailMapper;
import com.zmd.jcartadministrationback.dao.ProductMapper;
import com.zmd.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.zmd.jcartadministrationback.po.Product;
import com.zmd.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/26 17:21
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Override
    public Integer create(ProductCreateInDTO productCreateInDTO) {

        Product product = new Product();
        product.setProductCode(productCreateInDTO.getProductCode());
        product.setProductName(productCreateInDTO.getProductName());



        return null;
    }



}
