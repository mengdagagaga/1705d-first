package com.zmd.jcartadministarationback.controller;

import com.zmd.jcartadministarationback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:04
 */
@RestController
@RequestMapping("/address")
public class AddressController {


    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){
        return null;
    }





}
