package com.zmd.jcartadministrationback.controller;

import com.zmd.jcartadministrationback.constant.ClientExceptionConstant;
import com.zmd.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import com.zmd.jcartadministrationback.dto.out.AdministratorLoginOutDTO;
import com.zmd.jcartadministrationback.exception.ClientException;
import com.zmd.jcartadministrationback.po.Administrator;
import com.zmd.jcartadministrationback.service.AdministratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * @author zmd
 * @version 1.0
 * @date 2020/3/24 16:29
 */
@SpringBootTest
class AdministratorControllerTest {

    @Autowired
    private AdministratorController administratorController;

    @MockBean
    private AdministratorService administratorService;

    @Test
    void loginSuccess() throws ClientException {
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("zmd");
        administratorLoginInDTO.setPassword("123456");
        Administrator mockAdministrator = new Administrator();
        mockAdministrator.setUsername("zmd");
        mockAdministrator.setEncryptedPassword("$2a$12$LK3j3K/oVEwsSOwnTxnu9OJavo87tOvMvuKMUkWYR7XYbydfZEe4W");
        when(administratorService.getByUsername("zmd")).thenReturn(mockAdministrator);
        AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        assertNotNull(loginOutDTO);


    }

    @Test
    void loginWrongUsername(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("zmd");
        administratorLoginInDTO.setPassword("123456");
        try {
            AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, errCode);
        }
    }


    @Test
    void loginWrongPassword(){
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("zmd");
        administratorLoginInDTO.setPassword("123456");
        try {
            AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_PASSWORD_INVALID_ERRCODE, errCode);
        }
    }



}