package com.yz.bitedao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/5/19
 * 创建人:yz
 */
@RestController
public class UserController {
    @GetMapping("/test")
    public String test(){
        return  "asd燕1212樟";
    }
}
