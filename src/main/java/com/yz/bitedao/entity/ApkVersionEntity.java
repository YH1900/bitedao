package com.yz.bitedao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * APK版本实体
 * 表名 APK_VERSION
 *
 * @author sugon
 * @date 2020-04-21 11:52:46
 */
public class ApkVersionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * apk版本名称
     */
    private String version;
    /**
     * apk文件名字
     */
    private String apkName;
    /**
     * 链接地址
     */
    private String url;
    /**
     * 名称
     */
    private String name;
    /**
     * 版本序号
     */
    private Integer vNo;
    /**
     * 版本ID
     */
    private String id;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 新增人
     */
    private String createUser;
    /**
     * 新增时间
     */
    private Date createTime;

    /**
     * 设置：${column.comments}
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取：${column.comments}
     */
    public String getVersion() {
        return version;
    }
    /**
     * 设置：${column.comments}
     */
    public void setApkName(String apkName) {
        this.apkName = apkName;
    }

    /**
     * 获取：${column.comments}
     */
    public String getApkName() {
        return apkName;
    }
    /**
     * 设置：链接地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取：链接地址
     */
    public String getUrl() {
        return url;
    }
    /**
     * 设置：名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：名称
     */
    public String getName() {
        return name;
    }
    /**
     * 设置：版本序号
     */
    public void setVNo(Integer vNo) {
        this.vNo = vNo;
    }

    /**
     * 获取：版本序号
     */
    public Integer getVNo() {
        return vNo;
    }
    /**
     * 设置：${column.comments}
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取：${column.comments}
     */
    public String getId() {
        return id;
    }


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
