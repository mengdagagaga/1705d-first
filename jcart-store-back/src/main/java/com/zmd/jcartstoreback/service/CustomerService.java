package com.zmd.jcartstoreback.service;

import com.zmd.jcartstoreback.dto.in.CustomerRegisterInDTO;
import com.zmd.jcartstoreback.po.Customer;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/3 13:35
 */
public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    Customer getByEmail(String email);

    void update(Customer customer);


}
