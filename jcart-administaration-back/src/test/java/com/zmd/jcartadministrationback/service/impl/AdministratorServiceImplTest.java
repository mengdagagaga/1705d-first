package com.zmd.jcartadministrationback.service.impl;

import com.zmd.jcartadministrationback.po.Administrator;
import com.zmd.jcartadministrationback.service.AdministratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author zmd
 * @version 1.0
 * @date 2020/3/24 16:24
 */
@SpringBootTest
class AdministratorServiceImplTest {

    @Autowired
    private AdministratorService administratorService;

    @Test
    void getByUsername() {
        String username = "zmd";
        Administrator administrator = administratorService.getByUsername(username);
        assertNotNull(administrator);
        username = "zmd001";
        administrator = administratorService.getByUsername(username);
        assertNull(administrator);
    }
}