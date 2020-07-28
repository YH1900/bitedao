package com.yz.bitedao.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/5/19
 * 创建人:yz
 */
@RestController
public class UserController {

    @GetMapping("/test")
    public String index(String test){
        System.out.println("CMDI");
        String asdas="asdas";

        System.out.println("CMDI");
        return "";
    }
}
