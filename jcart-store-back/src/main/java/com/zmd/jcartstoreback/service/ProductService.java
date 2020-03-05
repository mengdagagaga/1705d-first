package com.zmd.jcartstoreback.service;

import com.github.pagehelper.Page;
import com.zmd.jcartstoreback.dto.out.ProductListOutDTO;
import com.zmd.jcartstoreback.dto.out.ProductShowOutDTO;
import com.zmd.jcartstoreback.po.Product;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/3 13:20
 */
public interface ProductService {
    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
