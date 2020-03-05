package com.zmd.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.zmd.jcartadministrationback.po.Customer;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/5 19:55
 */
public interface CustomerService {
    Page<Customer> search(Integer pageNum);

}
