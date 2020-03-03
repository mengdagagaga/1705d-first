package com.zmd.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.zmd.jcartadministrationback.po.Administrator;

import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/3/3 20:07
 */
public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    Integer create(Administrator administrator);

    void update(Administrator administrator);

    void delete(Integer administratorId);

    void batchDelete(List<Integer> administratorIds);

    Page<Administrator> getList(Integer pageNum);

}
