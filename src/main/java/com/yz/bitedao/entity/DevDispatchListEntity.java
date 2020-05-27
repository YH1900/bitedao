package com.yz.bitedao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 派工记录实体
 * 表名 DEV_DISPATCH_LIST
 *
 * @author sugon
 * @date 2019-08-08 08:56:30
 */
public class DevDispatchListEntity implements Serializable {
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
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 删除标识
     */
    private Integer delFlag;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否接单
     */
    private Integer isAcceptOrder;
    /**
     * 工单接受时间
     */
    private Date receiveTime;
    /**
     * 派工时间
     */
    private Date dispatchTime;
    /**
     * 工单接收人
     */
    private String receiveUser;
    /**
     * 派工人员
     */
    private String dispatchUser;
    /**
     * 报修编号/巡检编号
     */
    private String maintenCode;
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
     * 设置：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }
    /**
     * 设置：创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取：创建人
     */
    public String getCreateUser() {
        return createUser;
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
     * 设置：是否接单
     */
    public void setIsAcceptOrder(Integer isAcceptOrder) {
        this.isAcceptOrder = isAcceptOrder;
    }

    /**
     * 获取：是否接单
     */
    public Integer getIsAcceptOrder() {
        return isAcceptOrder;
    }
    /**
     * 设置：工单接受时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 获取：工单接受时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }
    /**
     * 设置：派工时间
     */
    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    /**
     * 获取：派工时间
     */
    public Date getDispatchTime() {
        return dispatchTime;
    }
    /**
     * 设置：工单接收人
     */
    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }

    /**
     * 获取：工单接收人
     */
    public String getReceiveUser() {
        return receiveUser;
    }
    /**
     * 设置：派工人员
     */
    public void setDispatchUser(String dispatchUser) {
        this.dispatchUser = dispatchUser;
    }

    /**
     * 获取：派工人员
     */
    public String getDispatchUser() {
        return dispatchUser;
    }
    /**
     * 设置：报修编号/巡检编号
     */
    public void setMaintenCode(String maintenCode) {
        this.maintenCode = maintenCode;
    }

    /**
     * 获取：报修编号/巡检编号
     */
    public String getMaintenCode() {
        return maintenCode;
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
