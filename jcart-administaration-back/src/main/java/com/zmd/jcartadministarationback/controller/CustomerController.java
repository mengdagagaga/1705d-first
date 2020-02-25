package com.zmd.jcartadministarationback.controller;

import com.zmd.jcartadministarationback.dto.in.CustomerSearchInDTO;
import com.zmd.jcartadministarationback.dto.out.CustomerListOutDTO;
import com.zmd.jcartadministarationback.dto.out.CustomerShowOutDTO;
import com.zmd.jcartadministarationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 17:26
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum) {
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId) {
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }


}
