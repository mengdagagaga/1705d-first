package com.zmd.jcartadministrationback.service;

import com.zmd.jcartadministrationback.po.Address;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/5 20:05
 */
public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);


}
