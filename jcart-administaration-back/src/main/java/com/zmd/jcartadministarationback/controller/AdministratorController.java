package com.zmd.jcartadministarationback.controller;

import com.zmd.jcartadministarationback.dto.in.AdministratorCreateInDTO;
import com.zmd.jcartadministarationback.dto.in.AdministratorLoginInDTO;
import com.zmd.jcartadministarationback.dto.in.AdministratorUpdateInDTO;
import com.zmd.jcartadministarationback.dto.in.AdministratorUpdateProfileInDTO;
import com.zmd.jcartadministarationback.dto.out.AdministratorGetProfileOutDTO;
import com.zmd.jcartadministarationback.dto.out.AdministratorListOutDTO;
import com.zmd.jcartadministarationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/24 16:45
 */
@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    @GetMapping("/login")
    public String login(AdministratorLoginInDTO administratorLoginInDTO) {
        return null;
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
        return  null;
    }


}
