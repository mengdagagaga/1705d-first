package com.zmd.jcartadministrationback.service;

import com.zmd.jcartadministrationback.dto.in.ProductCreateInDTO;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/26 17:19
 */
public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);
}
