package com.yz.bitedao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备ICC代码维护实体
 * 表名 DEV_CODE_ICC
 *
 * @author sugon
 * @date 2019-07-15 11:28:13
 */
public class DevCodeIccEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 备注
     */
    private String remark;
    /**
     * ICC代码
     */
    private String iccCode;
    /**
     * 生产线ID
     */
    private String proLineId;
    /**
     * 车间ID
     */
    private String workshopId;
    /**
     * 生产线
     */
    private String proLineName;
    /**
     * 车间
     */
    private String workshopName;
    /**
     * 设备ID
     */
    private String devId;
    /**
     * 设备名称
     */
    private String devName;
    /**
     * 设备编码
     */
    private String devCode;
    /**
     * ID
     */
    private String id;
    /**
     * 修改时间
     */
    private Date updateDate;
    /**
     * 修改人
     */
    private String updateUser;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 删除标识
     */
    private Integer delFlag;

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
     * 设置：ICC代码
     */
    public void setIccCode(String iccCode) {
        this.iccCode = iccCode;
    }

    /**
     * 获取：ICC代码
     */
    public String getIccCode() {
        return iccCode;
    }
    /**
     * 设置：生产线ID
     */
    public void setProLineId(String proLineId) {
        this.proLineId = proLineId;
    }

    /**
     * 获取：生产线ID
     */
    public String getProLineId() {
        return proLineId;
    }
    /**
     * 设置：车间ID
     */
    public void setWorkshopId(String workshopId) {
        this.workshopId = workshopId;
    }

    /**
     * 获取：车间ID
     */
    public String getWorkshopId() {
        return workshopId;
    }
    /**
     * 设置：生产线
     */
    public void setProLineName(String proLineName) {
        this.proLineName = proLineName;
    }

    /**
     * 获取：生产线
     */
    public String getProLineName() {
        return proLineName;
    }
    /**
     * 设置：车间
     */
    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    /**
     * 获取：车间
     */
    public String getWorkshopName() {
        return workshopName;
    }
    /**
     * 设置：设备ID
     */
    public void setDevId(String devId) {
        this.devId = devId;
    }

    /**
     * 获取：设备ID
     */
    public String getDevId() {
        return devId;
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
     * 设置：ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取：ID
     */
    public String getId() {
        return id;
    }
    /**
     * 设置：修改时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取：修改时间
     */
    public Date getUpdateDate() {
        return updateDate;
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
     * 设置：创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取：创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}
