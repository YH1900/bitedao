package com.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.ApiResult;

public class AjaxServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        ApiResult<Integer> apiResult = new ApiResult<Integer>();

        String val1 = req.getParameter("val1");
        String val2 = req.getParameter("val2");

        try {
            Integer intVal1 = Integer.parseInt(val1);
            Integer intVal2 = Integer.parseInt(val2);

            Integer result = intVal1 + intVal2;
            apiResult.setStatus(200);
            apiResult.setMsg("SUCCESS");
            apiResult.setData(result);

        } catch (NumberFormatException ex) {
            apiResult.setStatus(500);
            apiResult.setMsg("parese Exception");
        }

        // 将对象发送到请求端 将java对象通过网络传输给页面
        //String apiResultStr = JSON.toJSONString(apiResult);
        // 告诉浏览器端返回的是json格式的数据
        resp.setContentType("application/json;charset=utf-8");
        Writer out = resp.getWriter();
        //	out.write(apiResultStr);
        out.flush();

    }

}
