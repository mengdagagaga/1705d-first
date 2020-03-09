package com.zmd.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.zmd.jcartadministrationback.dto.in.ReturnSearchInDTO;
import com.zmd.jcartadministrationback.po.Return;

/**
 * @author zmd
 * @version 1.0
 * @date 2020/3/9 14:48
 */
public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);
}
