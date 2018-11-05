package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.ApiResult;
import com.pojo.User;
import com.service.ShiWuTest;

@Controller
@RequestMapping("/tou")
public class RegisterController {
    @Autowired
    private ShiWuTest stw;
    @Autowired
    private ApiResult apiResult;

    @RequestMapping("/text.do")
    public String test(HttpServletRequest rs, HttpServletResponse ps) {
        Cookie cook = new Cookie("cook", "imcook");
        ps.addCookie(cook);
        return "Test";
    }

    @RequestMapping("/zhuanzhang.do")
    public void zhuanzhang() {
        stw.accountMoney(1000, 1, 2);
    }

    @RequestMapping(value = "/js.do/{userId}", method = {
            RequestMethod.POST}, produces = "application/json;charset=utf-8")
    @ResponseBody
    public ApiResult<List<User>> jsontest(HttpServletRequest rs, HttpServletResponse po,
                                          @PathVariable(value = "userId") Integer userId,
                                          @RequestParam(value = "name", defaultValue = "yz") String name) throws IOException {
        System.out.println(userId);
        System.out.println(name);
        List<User> list = new ArrayList<>();
        list.add(new User(1, "燕樟", "123456"));
        list.add(new User(2, "二狗", "123236"));
        list.add(new User(3, "吴振", "43242"));
        apiResult.setStatus(200);
        apiResult.setMsg("成功");
        apiResult.setData(list);
        return apiResult;
    }

    public static void main(String[] args) {
        int x = 10;
        x %= 3;
        System.out.println(x);
    }
}
