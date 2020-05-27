package com.yz.bitedao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 生产设备台账实体
 * 表名 DEV_ACCOUNT
 *
 * @author sugon
 * @date 2019-07-26 15:46:22
 */
public class DevAccountEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 修改人
     */
    private String updateUser;
    /**
     * 操作人
     */
    private String createUser;
    /**
     * 操作时间
     */
    private Date createTime;
    /**
     * 删除标识
     */
    private Integer delFlag;
    /**
     * 备注
     */
    private String remark;
    /**
     * 状态
     */
    private String devStatus;
    /**
     * 特种设备
     */
    private String isSpec;
    /**
     * 工序号
     */
    private String devProceNo;
    /**
     * 生产线名称
     */
    private String devProducName;
    /**
     * 所属车间
     */
    private String devWorkshop;
    /**
     * 所属工厂
     */
    private String devFactories;
    /**
     * 设备名称
     */
    private String devName;
    /**
     * 设备编码
     */
    private String devCode;
    /**
     * $column.comments
     */
    private String id;

    /**
     * 设置：修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }
    /**
     * 设置：修改人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取：修改人
     */
    public String getUpdateUser() {
        return updateUser;
    }
    /**
     * 设置：操作人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取：操作人
     */
    public String getCreateUser() {
        return createUser;
    }
    /**
     * 设置：操作时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：操作时间
     */
    public Date getCreateTime() {
        return createTime;
    }
    /**
     * 设置：删除标识
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取：删除标识
     */
    public Integer getDelFlag() {
        return delFlag;
    }
    /**
     * 设置：备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：备注
     */
    public String getRemark() {
        return remark;
    }
    /**
     * 设置：状态
     */
    public void setDevStatus(String devStatus) {
        this.devStatus = devStatus;
    }

    /**
     * 获取：状态
     */
    public String getDevStatus() {
        return devStatus;
    }
    /**
     * 设置：特种设备
     */
    public void setIsSpec(String isSpec) {
        this.isSpec = isSpec;
    }

    /**
     * 获取：特种设备
     */
    public String getIsSpec() {
        return isSpec;
    }
    /**
     * 设置：工序号
     */
    public void setDevProceNo(String devProceNo) {
        this.devProceNo = devProceNo;
    }

    /**
     * 获取：工序号
     */
    public String getDevProceNo() {
        return devProceNo;
    }
    /**
     * 设置：生产线名称
     */
    public void setDevProducName(String devProducName) {
        this.devProducName = devProducName;
    }

    /**
     * 获取：生产线名称
     */
    public String getDevProducName() {
        return devProducName;
    }
    /**
     * 设置：所属车间
     */
    public void setDevWorkshop(String devWorkshop) {
        this.devWorkshop = devWorkshop;
    }

    /**
     * 获取：所属车间
     */
    public String getDevWorkshop() {
        return devWorkshop;
    }
    /**
     * 设置：所属工厂
     */
    public void setDevFactories(String devFactories) {
        this.devFactories = devFactories;
    }

    /**
     * 获取：所属工厂
     */
    public String getDevFactories() {
        return devFactories;
    }
    /**
     * 设置：设备名称
     */
    public void setDevName(String devName) {
        this.devName = devName;
    }

    /**
     * 获取：设备名称
     */
    public String getDevName() {
        return devName;
    }
    /**
     * 设置：设备编码
     */
    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    /**
     * 获取：设备编码
     */
    public String getDevCode() {
        return devCode;
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
}
