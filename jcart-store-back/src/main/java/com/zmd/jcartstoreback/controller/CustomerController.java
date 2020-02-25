package com.zmd.jcartstoreback.controller;

import com.zmd.jcartstoreback.dto.in.CustomerChangePwdInDTO;
import com.zmd.jcartstoreback.dto.in.CustomerRegisterInDTO;
import com.zmd.jcartstoreback.dto.in.CustomerResetPwdInDTO;
import com.zmd.jcartstoreback.dto.in.CustomerUpdateProfileInDTO;
import com.zmd.jcartstoreback.dto.out.CustomerProfileOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 15:59
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {


    @PostMapping("/register")
    public Integer register(@RequestBody CustomerRegisterInDTO customerRegisterInDTO){
        return null;
    }


    @GetMapping("/login")
    public String login(){
        return null;
    }

    @GetMapping("/getProfile")
    public CustomerProfileOutDTO getProfile(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody CustomerUpdateProfileInDTO customerUpdateProfileInDTO,
                              @RequestAttribute Integer customerId){

    }

    @PostMapping("/changePwd")
    public void changePwd(@RequestBody CustomerChangePwdInDTO customerChangePwdInDTO){

    }


    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody CustomerResetPwdInDTO customerResetPwdInDTO){

    }





}
