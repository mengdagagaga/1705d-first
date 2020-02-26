package com.zmd.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.zmd.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.zmd.jcartadministrationback.dto.in.ProductUpdateInDTO;
import com.zmd.jcartadministrationback.dto.out.ProductListOutDTO;
import com.zmd.jcartadministrationback.dto.out.ProductShowOutDTO;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/26 17:19
 */
public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}
