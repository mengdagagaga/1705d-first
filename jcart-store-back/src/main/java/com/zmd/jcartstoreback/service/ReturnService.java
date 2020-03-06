package com.zmd.jcartstoreback.service;

import com.github.pagehelper.Page;
import com.zmd.jcartstoreback.po.Return;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/6 15:55
 */
public interface ReturnService {

    Integer create(Return aReturn);

    Page<Return> getPageByCustomerId(Integer customerId, Integer pageNum);

    Return getById(Integer returnId);
}
