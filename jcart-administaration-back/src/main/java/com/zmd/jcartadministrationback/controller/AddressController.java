package com.zmd.jcartadministrationback.controller;

import com.zmd.jcartadministrationback.dto.out.AddressListOutDTO;
import com.zmd.jcartadministrationback.po.Address;
import com.zmd.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:04
 */
@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {


    @Autowired
    private AddressService addressService;

    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){

        List<Address> addresses = addressService.getByCustomerId(customerId);
        List<AddressListOutDTO> addressListOutDTOS = addresses.stream().map(address -> {
            AddressListOutDTO addressListOutDTO = new AddressListOutDTO();
            addressListOutDTO.setAddressId(address.getAddressId());
            addressListOutDTO.setContent(address.getContent());
            addressListOutDTO.setReceiverMobile(address.getReceiverMobile());
            addressListOutDTO.setReceiverName(address.getReceiverName());
            addressListOutDTO.setTag(address.getTag());
            return addressListOutDTO;

        }).collect(Collectors.toList());

        return addressListOutDTOS;
    }





}
