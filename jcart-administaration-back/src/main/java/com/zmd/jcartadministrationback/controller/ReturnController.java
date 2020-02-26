package com.zmd.jcartadministrationback.controller;

import com.zmd.jcartadministrationback.dto.in.ReturnSearchInDTO;
import com.zmd.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import com.zmd.jcartadministrationback.dto.out.PageOutDTO;
import com.zmd.jcartadministrationback.dto.out.ReturnListOutDTO;
import com.zmd.jcartadministrationback.dto.out.ReturnShowOutDTO;
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
