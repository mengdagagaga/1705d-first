package com.zmd.jcartstoreback.service;

import com.zmd.jcartstoreback.po.Address;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/4 0:32
 */
public interface AddressService {


    List<Address> getByCustomerId(Integer customerId);

    Integer create(Address address);

    void update(Address address);

    Address getById(Integer addressId);

    void delete(Integer addressId);
}
