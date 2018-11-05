package com.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;

import org.springframework.stereotype.Service;


@Service
@JsonInclude(Include.NON_NULL)
public class ApiResult<T> implements Serializable {

    private static final long serialVersionUID = -4931660805076804434L;
    // 状态码
    private Integer status;
    // 响应结果描述
    private String msg;
    // 响应数据
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
