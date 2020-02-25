package com.zmd.jcartstoreback.controller;

import com.zmd.jcartstoreback.dto.in.ReturnApplyInDTO;
import com.zmd.jcartstoreback.dto.out.PageOutDTO;
import com.zmd.jcartstoreback.dto.out.ReturnListOutDTO;
import com.zmd.jcartstoreback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 16:56
 */
@RestController
@RequestMapping("/return")
public class ReturnController {

    @PostMapping("/apply")
    public Integer apply(@RequestBody ReturnApplyInDTO returnApplyInDTO) {
        return null;
    }

    @GetMapping("/getReturnByCustomerId")
    public PageOutDTO<ReturnListOutDTO> getReturnByCustomerId(@RequestParam Integer pageNum,
                                                              @RequestParam Integer customerId) {
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId) {
        return null;
    }


}
