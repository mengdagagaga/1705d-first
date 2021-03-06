package com.zmd.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import com.zmd.jcartadministrationback.po.Administrator;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer administratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);



    //my
    Administrator selectByUsername(String username);

    void batchDelete(List<Integer> administratorIds);

    Page<Administrator> selectList();

    Administrator selectByEmail(@Param("email") String email);
}