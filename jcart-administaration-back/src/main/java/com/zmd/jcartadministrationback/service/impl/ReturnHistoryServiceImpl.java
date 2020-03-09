package com.zmd.jcartadministrationback.service.impl;

import com.zmd.jcartadministrationback.dao.ReturnHistoryMapper;
import com.zmd.jcartadministrationback.po.ReturnHistory;
import com.zmd.jcartadministrationback.service.ReturnHistoryService;
import com.zmd.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zmd
 * @version 1.0
 * @date 2020/3/9 15:12
 */
@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {
    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Autowired
    private ReturnService returnService;

    @Override
    public List<ReturnHistory> getListByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectListByReturnId(returnId);
        return returnHistories;
    }
}
