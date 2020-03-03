package com.zmd.jcartstoreback.service.impl;

import com.zmd.jcartstoreback.dao.AddressMapper;
import com.zmd.jcartstoreback.po.Address;
import com.zmd.jcartstoreback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/4 0:32
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> getByCustomerId(Integer customerId) {
        List<Address> addresses = addressMapper.selectByCustomerId(customerId);
        return addresses;
    }
}
