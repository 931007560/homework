package com.ltl.opencartadminstrationback.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/image")
public class ImageController {

    /** @Author ltl
     * @Description //TODO
     * @Date 16:02 2020/2/24
     * @Param [image]
     * @return java.lang.String
     **/
    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile image){

        return null;
    }
}
