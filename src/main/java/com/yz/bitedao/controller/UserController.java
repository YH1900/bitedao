package com.yz.bitedao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2020/5/19
 * 创建人:yz
 */
@RestController
public class UserController {
    @GetMapping("/te1s1t")
    public String test(){
        return  "test";
    }
    @GetMapping("/test11")
    public String test1(){
        return  "test";
    }
}
