package com.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.ShiWuTest;

@Component
public class Test {
    @Autowired
    private ShiWuTest test;
    @Autowired
    private Test2 test2;

    public void add() {

    }
}
