package com.zmd.jcartstoreback.service;

import com.zmd.jcartstoreback.po.ReturnHistory;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/6 16:28
 */
public interface ReturnHistoryService {


    List<ReturnHistory> getByReturnId(Integer returnId);


}
