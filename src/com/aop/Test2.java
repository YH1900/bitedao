package com.aop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.service.ShiWuTest;

@Component("Test2")
@Aspect
public class Test2 {
    @Autowired
    private ShiWuTest test;

    @Autowired
    @Before("execution(* com.service.Test.add())")
    public void befor() {
        System.out.println("befor");
    }

    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("cmd /C tasklist");
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream(), "gbk"));//windows的默认系统中文编码是gbk所以从cmd控制台的信息已gbk来解码
        String line = null;
        while ((line = reader.readLine()) != null)
            System.out.println(line);
    }
}
