package com.zmd.jcartadministarationback.controller;

import com.zmd.jcartadministarationback.dto.in.ReturnSearchInDTO;
import com.zmd.jcartadministarationback.dto.in.ReturnUpdateActionInDTO;
import com.zmd.jcartadministarationback.dto.out.PageOutDTO;
import com.zmd.jcartadministarationback.dto.out.ReturnListOutDTO;
import com.zmd.jcartadministarationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 14:38
 */
@RestController
@RequestMapping("/return")
public class ReturnController {



    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }


    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }





}
