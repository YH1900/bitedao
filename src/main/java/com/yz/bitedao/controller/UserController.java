package com.yz.bitedao.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/5/19
 * 创建人:yz
 */
@RestController
public class UserController {
    @GetMapping("/index")
    public String test(){
        return "/lib/apk/db/"+FilenameUtils.getName("/lib/apk/db/instal");
    }
}
