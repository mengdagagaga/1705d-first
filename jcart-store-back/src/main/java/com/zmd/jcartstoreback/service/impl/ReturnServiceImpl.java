package com.zmd.jcartstoreback.service.impl;

import com.zmd.jcartstoreback.dao.ReturnMapper;
import com.zmd.jcartstoreback.po.Return;
import com.zmd.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/6 16:00
 */
@Service
public class ReturnServiceImpl implements ReturnService {

    @Autowired
    private ReturnMapper returnMapper;


    @Override
    public Integer create(Return aReturn) {
        Integer returnId = returnMapper.insertSelective(aReturn);
        return returnId;
    }
}
