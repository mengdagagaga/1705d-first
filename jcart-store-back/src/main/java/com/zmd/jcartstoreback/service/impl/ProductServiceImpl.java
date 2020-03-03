package com.zmd.jcartstoreback.service.impl;

import com.github.pagehelper.Page;
import com.zmd.jcartstoreback.dto.out.ProductListOutDTO;
import com.zmd.jcartstoreback.dto.out.ProductShowOutDTO;
import com.zmd.jcartstoreback.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/3 13:21
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Override
    public ProductShowOutDTO getById(Integer productId) {
        return null;
    }

    @Override
    public Page<ProductListOutDTO> search(Integer pageNum) {
        return null;
    }
}
