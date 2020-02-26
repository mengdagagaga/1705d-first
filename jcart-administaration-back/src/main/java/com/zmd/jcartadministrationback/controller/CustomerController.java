package com.zmd.jcartadministrationback.controller;

import com.zmd.jcartadministrationback.dto.in.CustomerSearchInDTO;
import com.zmd.jcartadministrationback.dto.out.CustomerListOutDTO;
import com.zmd.jcartadministrationback.dto.out.CustomerShowOutDTO;
import com.zmd.jcartadministrationback.dto.out.PageOutDTO;
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
