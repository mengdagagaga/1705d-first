package com.zmd.jcartstoreback.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ZMD
 * @version 1.0
 * @date 2020/2/25 15:57
 */
@RestController
@RequestMapping("/image")
public class ImageController {

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile image){
        return null;
    }


}
