package com.zmd.jcartstoreback.dao;

import com.github.pagehelper.Page;
import com.zmd.jcartstoreback.po.Return;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(Return record);

    int updateByPrimaryKey(Return record);


    //my
    Page<Return> selectPageByCustomerId(@Param("customerId")Integer customerId);
}