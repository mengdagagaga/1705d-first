package com.zmd.jcartstoreback.service;

import com.github.pagehelper.Page;
import com.zmd.jcartstoreback.dto.out.ProductListOutDTO;
import com.zmd.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.stereotype.Service;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/3 13:20
 */

public interface ProductService {
    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
