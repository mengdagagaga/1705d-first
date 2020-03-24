package com.zmd.jcartadministrationback.dao;

import com.zmd.jcartadministrationback.po.Administrator;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import static org.junit.jupiter.api.Assertions.*;
/**
 * @author zmd
 * @version 1.0
 * @date 2020/3/24 16:13
 */
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class AdministratorMapperTest {

    @Autowired
    private AdministratorMapper administratorMapper;

    @Test
    void selectByUsername() {
        String username = "zmd";
        Administrator administrator = administratorMapper.selectByUsername(username);
        assertNotNull(administrator);
        username = "zmd001";
        administrator = administratorMapper.selectByUsername(username);
        assertNull(administrator);
    }



}