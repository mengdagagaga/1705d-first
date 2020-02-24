package com.zmd.jcartadministarationback.controller;

import com.zmd.jcartadministarationback.dto.in.ProductCreateInDTO;
import com.zmd.jcartadministarationback.dto.in.ProductUpdateInDTO;
import com.zmd.jcartadministarationback.dto.out.PageOutDTO;
import com.zmd.jcartadministarationback.dto.out.ProductListOutDTO;
import com.zmd.jcartadministarationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 17:16
 */
@RestController
@RequestMapping("/product")
public class ProductController {


    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(@RequestParam(required = false) String productCode,
                                                @RequestParam(required = false) String productName,
                                                @RequestParam(required = false) Double price,
                                                @RequestParam(required = false) Integer quantity,
                                                @RequestParam(required = false) Byte status,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }



    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
    }


    @GetMapping("/show")
    public ProductShowOutDTO show(Integer productId){
        return null;
    }
}
