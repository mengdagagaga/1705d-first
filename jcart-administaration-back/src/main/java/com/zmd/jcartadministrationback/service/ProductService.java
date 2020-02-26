package com.zmd.jcartadministrationback.service;

import com.zmd.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.zmd.jcartadministrationback.dto.in.ProductUpdateInDTO;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/26 17:19
 */
public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);
}
