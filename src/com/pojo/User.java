package com.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
@JsonInclude(Include.NON_NULL)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String password;
    private String nicheng;
    private String telPhone;
    private String email;
    private String touxiang;
    private String qq;
    private String qqId;
    private String wxHao;
    private String wxId;
    private String wxUnionId;
    private Integer sex;
    private Integer age;
    private Date zhuceDate;
    private String my2wm;
    private String weibo;

    public User(Integer id, String name, String password) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
    }


    public User() {
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getNicheng() {
        return nicheng;
    }


    public void setNicheng(String nicheng) {
        this.nicheng = nicheng;
    }


    public String getTelPhone() {
        return telPhone;
    }


    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTouxiang() {
        return touxiang;
    }


    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
    }


    public String getQq() {
        return qq;
    }


    public void setQq(String qq) {
        this.qq = qq;
    }


    public String getQqId() {
        return qqId;
    }


    public void setQqId(String qqId) {
        this.qqId = qqId;
    }


    public String getWxHao() {
        return wxHao;
    }


    public void setWxHao(String wxHao) {
        this.wxHao = wxHao;
    }


    public String getWxId() {
        return wxId;
    }


    public void setWxId(String wxId) {
        this.wxId = wxId;
    }


    public String getWxUnionId() {
        return wxUnionId;
    }


    public void setWxUnionId(String wxUnionId) {
        this.wxUnionId = wxUnionId;
    }


    public Integer getSex() {
        return sex;
    }


    public void setSex(Integer sex) {
        this.sex = sex;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public Date getZhuceDate() {
        return zhuceDate;
    }


    public void setZhuceDate(Date zhuceDate) {
        this.zhuceDate = zhuceDate;
    }


    public String getMy2wm() {
        return my2wm;
    }


    public void setMy2wm(String my2wm) {
        this.my2wm = my2wm;
    }


    public String getWeibo() {
        return weibo;
    }


    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }


    public static long getSerialversionuid() {
        return serialVersionUID;
    }


}