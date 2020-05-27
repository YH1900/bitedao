package com.yz.bitedao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备组织结构管理实体
 * 表名 DEPT_INFO
 *
 * @author sunlianqiang
 * @date 2019-07-15 15:32:48
 */
public class DeptInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 是否删除标志 0已删除 1未删除
     */
    private Integer isDel;
    /**
     * 类型 0产线区段 1生产线 2车间 3工厂
     */
    private String type;
    /**
     * 上级名称
     */
    private String pname;
    /**
     * 上级ID
     */
    private String pid;
    /**
     * 名称
     */
    private String name;
    /**
     * 主键
     */
    private String id;

    /**
     * 部门代码
     */
    private String dCode;

    /**
     * 设置：是否删除标志 0已删除 1未删除
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取：是否删除标志 0已删除 1未删除
     */
    public Integer getIsDel() {
        return isDel;
    }
    /**
     * 设置：类型 0产线区段 1生产线 2车间 3工厂
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取：类型 0产线区段 1生产线 2车间 3工厂
     */
    public String getType() {
        return type;
    }
    /**
     * 设置：上级名称
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * 获取：上级名称
     */
    public String getPname() {
        return pname;
    }
    /**
     * 设置：上级ID
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取：上级ID
     */
    public String getPid() {
        return pid;
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
     * 设置：主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取：主键
     */
    public String getId() {
        return id;
    }

    /**
     * 部门代码
     * @return
     */
    public String getdCode() {
        return dCode;
    }

    public void setdCode(String dCode) {
        this.dCode = dCode;
    }
}
