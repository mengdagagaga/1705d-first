package com.zmd.jcartadministrationback.service;

import com.zmd.jcartadministrationback.po.ReturnHistory;

import java.util.List;

/**
 * @author zmd
 * @version 1.0
 * @date 2020/3/9 15:12
 */
public interface ReturnHistoryService {
    List<ReturnHistory> getListByReturnId(Integer returnId);

}
