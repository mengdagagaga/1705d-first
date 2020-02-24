package com.zmd.jcartadministarationback.controller;

import com.zmd.jcartadministarationback.dto.out.AddressShowOutDTO;
import com.zmd.jcartadministarationback.dto.out.CustomerListOutDTO;
import com.zmd.jcartadministarationback.dto.out.CustomerShowOutDTO;
import com.zmd.jcartadministarationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 17:26
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(@RequestParam(required = false) String username,
                                                 @RequestParam(required = false) String realName,
                                                 @RequestParam(required = false) String mobile,
                                                 @RequestParam(required = false) String email,
                                                 @RequestParam(required = false) Byte status,
                                                 @RequestParam(required = false) Long createTimestamp,
                                                 @RequestParam(required = false, defaultValue = "1") Integer pageNum) {
        return null;
    }

    @GetMapping("/show")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId) {
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestBody Integer customerId){

    }


    @PostMapping("/addressAll")
    public List<AddressShowOutDTO> addressAll(@RequestBody Integer customerId){
        return null;
    }



}
