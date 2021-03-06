package com.zmd.jcartadministrationback.service.impl;

import com.zmd.jcartadministrationback.dao.ReturnHistoryMapper;
import com.zmd.jcartadministrationback.po.Return;
import com.zmd.jcartadministrationback.po.ReturnHistory;
import com.zmd.jcartadministrationback.service.ReturnHistoryService;
import com.zmd.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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

    @Override
    @Transactional
    public Long create(ReturnHistory returnHistory) {

        returnHistoryMapper.insertSelective(returnHistory);
        Long returnHistoryId = returnHistory.getReturnHistoryId();

        Return aReturn = new Return();
        aReturn.setReturnId(returnHistory.getReturnId());
        aReturn.setUpdateTime(new Date());
        returnService.update(aReturn);

        return returnHistoryId;
    }
}
