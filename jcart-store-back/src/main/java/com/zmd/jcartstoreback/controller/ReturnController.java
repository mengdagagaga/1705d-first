package com.zmd.jcartstoreback.controller;

import com.zmd.jcartstoreback.dto.in.ReturnApplyInDTO;
import com.zmd.jcartstoreback.dto.out.PageOutDTO;
import com.zmd.jcartstoreback.dto.out.ReturnListOutDTO;
import com.zmd.jcartstoreback.dto.out.ReturnShowOutDTO;
import com.zmd.jcartstoreback.enumeration.ReturnStatus;
import com.zmd.jcartstoreback.po.Return;
import com.zmd.jcartstoreback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 16:56
 */
@RestController
@RequestMapping("/return")
public class ReturnController {

    @Autowired
    private ReturnService returnService;

    //退货申请
    @PostMapping("/apply")
    public Integer apply(@RequestBody ReturnApplyInDTO returnApplyInDTO,
                         @RequestAttribute Integer customerId) {
        Return aReturn = new Return();
        aReturn.setOrderId(returnApplyInDTO.getOrderId());
        aReturn.setOrderTime(new Date(returnApplyInDTO.getOrderTimestamp()));
        aReturn.setCustomerId(customerId);
        aReturn.setCustomerName(returnApplyInDTO.getCustomerName());
        aReturn.setMobile(returnApplyInDTO.getMobile());
        aReturn.setEmail(returnApplyInDTO.getEmail());
        aReturn.setStatus((byte) ReturnStatus.ToProcess.ordinal());
        aReturn.setProductCode(returnApplyInDTO.getProductCode());
        aReturn.setProductName(returnApplyInDTO.getProductName());
        aReturn.setQuantity(returnApplyInDTO.getQuantity());
        aReturn.setReason(returnApplyInDTO.getReason());
        aReturn.setOpened(returnApplyInDTO.getOpened());
        aReturn.setComment(returnApplyInDTO.getComment());
        Date now = new Date();
        aReturn.setCreateTime(now);
        aReturn.setUpdateTime(now);
        Integer returnId = returnService.create(aReturn);

        return returnId;
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
