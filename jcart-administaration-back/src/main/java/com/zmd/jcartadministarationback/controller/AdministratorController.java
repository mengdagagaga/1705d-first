package com.zmd.jcartadministarationback.controller;

import com.zmd.jcartadministarationback.dto.in.AdministratorLoginInDTO;
import com.zmd.jcartadministarationback.dto.in.AdministratorUpdateProfileInDTO;
import com.zmd.jcartadministarationback.dto.out.AdministratorGetProfileOutDTO;
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


}
