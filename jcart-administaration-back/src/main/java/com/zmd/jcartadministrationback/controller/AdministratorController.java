package com.zmd.jcartadministrationback.controller;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.zmd.jcartadministrationback.constant.ClientExceptionConstant;
import com.zmd.jcartadministrationback.dto.in.*;
import com.zmd.jcartadministrationback.dto.out.AdministratorGetProfileOutDTO;
import com.zmd.jcartadministrationback.dto.out.AdministratorListOutDTO;
import com.zmd.jcartadministrationback.dto.out.AdministratorLoginOutDTO;
import com.zmd.jcartadministrationback.dto.out.PageOutDTO;
import com.zmd.jcartadministrationback.enumeration.AdministratorStatus;
import com.zmd.jcartadministrationback.exception.ClientException;
import com.zmd.jcartadministrationback.po.Administrator;
import com.zmd.jcartadministrationback.service.AdministratorService;
import com.zmd.jcartadministrationback.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 16:45
 */
@RestController
@RequestMapping("/administrator")
@CrossOrigin
public class AdministratorController {
    @Autowired
    private AdministratorService administratorService;

    @Autowired
    private JWTUtil jwtUtil;

    @GetMapping("/login")
    public AdministratorLoginOutDTO login(AdministratorLoginInDTO administratorLoginInDTO) throws ClientException {

        Administrator administrator = administratorService.getByUsername(administratorLoginInDTO.getUsername());
        if (administrator == null){
            throw new ClientException(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE, ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRMSG);
        }
        String encPwdDB = administrator.getEncryptedPassword();
        BCrypt.Result result = BCrypt.verifyer().verify(administratorLoginInDTO.getPassword().toCharArray(), encPwdDB);

        if (result.verified) {
            AdministratorLoginOutDTO administratorLoginOutDTO = jwtUtil.issueToken(administrator);
            return administratorLoginOutDTO;
        }else {
            throw new ClientException(ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRCODE, ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRMSG);
        }
    }

    @GetMapping("/getProfile")
    public AdministratorGetProfileOutDTO getProfile(Integer administratorId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO){

    }

    @PostMapping("/update")
    public void update(@RequestBody AdministratorUpdateInDTO administratorUpdateInDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdministratorListOutDTO> getList(@RequestParam(required = false,defaultValue = "1") Integer pageNum){
        return null;
    }


    @PostMapping("/create")
    public Integer create(@RequestBody AdministratorCreateInDTO administratorCreateInDTO){
        Administrator administrator = new Administrator();
        administrator.setUsername(administratorCreateInDTO.getUsername());
        administrator.setRealName(administratorCreateInDTO.getRealName());
        administrator.setEmail(administratorCreateInDTO.getEmail());
        administrator.setAvatarUrl(administratorCreateInDTO.getAvatarUrl());
        administrator.setStatus((byte) AdministratorStatus.Enable.ordinal());
        administrator.setCreateTime(new Date());

        String bcryptHashString = BCrypt.withDefaults().hashToString(12, administratorCreateInDTO.getPassword().toCharArray());
        administrator.setEncryptedPassword(bcryptHashString);

        Integer administratorId = administratorService.create(administrator);

        return administratorId;
    }


    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }


    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody AdministratorResetPwdInDTO administratorResetPwdInDTO){

    }


    @PostMapping("/delete")
    public void delete(@RequestBody Integer administratorId){

    }


    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> administratorIds){

    }




}
