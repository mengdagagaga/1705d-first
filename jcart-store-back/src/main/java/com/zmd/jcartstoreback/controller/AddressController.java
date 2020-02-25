package com.zmd.jcartstoreback.controller;

import com.zmd.jcartstoreback.dto.in.AddressCreateInDTO;
import com.zmd.jcartstoreback.dto.in.AddressUpdateInDTO;
import com.zmd.jcartstoreback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 16:23
 */
@RestController
@RequestMapping("/address")
public class AddressController {


    @GetMapping("/getAddressByCustomerId")
    public List<AddressListOutDTO> getAddressByCustomerId(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AddressCreateInDTO addressCreateInDTO,
                          @RequestAttribute Integer customerId){
        return null;
    }


    @PostMapping("/update")
    public void update(@RequestBody AddressUpdateInDTO addressUpdateInDTO,
                          @RequestAttribute Integer customerId){

    }




}
