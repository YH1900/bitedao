package com.yz.bitedao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备变更记录实体
 * 表名 DEV_CHANGE_RECORD
 *
 * @author sugon
 * @date 2019-07-30 16:51:53
 */
public class DevChangeRecordEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 删除标识
     */
    private Integer isDel;
    /**
     * 出厂编号
     */
    private String checkReason;
    /**
     * 规格型号
     */
    private Integer checkResult;
    /**
     * 验收日期
     */
    private Date checkDate;
    /**
     * 特种设备
     */
    private Integer isSpec;
    /**
     * 自编号
     */
    private String autoNo;
    /**
     * 使用单位
     */
    private String useDept;
    /**
     * 工序名称
     */
    private String devProceName;
    /**
     * 工序号
     */
    private String devProceNo;
    /**
     * 生产线名称
     */
    private String devProducNamet;
    /**
     * 设备状态  0报废 1完好在用 2闲置 
     */
    private Integer devStatus;
    /**
     * 设备编码
     */
    private String devCode;
    /**
     * 设备名称
     */
    private String devName;
    /**
     * 主键
     */
    private String id;
    /**
     * 数量
     */
    private Integer devNum;
    /**
     * 型号
     */
    private String devModel;
    /**
     * 原因
     */
    private String reson;
    /**
     * 状态
     */
    private String status;
    /**
     * 地点
     */
    private String address;
    /**
     * 使用单位
     */
    private String useUnit;
    /**
     * 净值
     */
    private String netVal;
    /**
     * 原值
     */
    private String origVal;
    /**
     * 启用日期
     */
    private Date startDate;
    /**
     * 更新日期
     */
    private Date updateDate;
    /**
     * 更新者ID
     */
    private String updateUser;
    /**
     * 创建者ID
     */
    private String createUser;
    private String subFactory;
    private String workshop;
    private String workshopName;//车间名称
    private String devProducName;//生产线名称
    private String remark;

    /**
     * 上传日期
     */
    private Date createDate;

    /**
     * 设置：删除标识
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取：删除标识
     */
    public Integer getIsDel() {
        return isDel;
    }
    /**
     * 设置：出厂编号
     */
    public void setCheckReason(String checkReason) {
        this.checkReason = checkReason;
    }

    /**
     * 获取：出厂编号
     */
    public String getCheckReason() {
        return checkReason;
    }
    /**
     * 设置：规格型号
     */
    public void setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
    }

    /**
     * 获取：规格型号
     */
    public Integer getCheckResult() {
        return checkResult;
    }
    /**
     * 设置：验收日期
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 获取：验收日期
     */
    public Date getCheckDate() {
        return checkDate;
    }
    /**
     * 设置：特种设备
     */
    public void setIsSpec(Integer isSpec) {
        this.isSpec = isSpec;
    }

    /**
     * 获取：特种设备
     */
    public Integer getIsSpec() {
        return isSpec;
    }
    /**
     * 设置：自编号
     */
    public void setAutoNo(String autoNo) {
        this.autoNo = autoNo;
    }

    /**
     * 获取：自编号
     */
    public String getAutoNo() {
        return autoNo;
    }
    /**
     * 设置：使用单位
     */
    public void setUseDept(String useDept) {
        this.useDept = useDept;
    }

    /**
     * 获取：使用单位
     */
    public String getUseDept() {
        return useDept;
    }
    /**
     * 设置：工序名称
     */
    public void setDevProceName(String devProceName) {
        this.devProceName = devProceName;
    }

    /**
     * 获取：工序名称
     */
    public String getDevProceName() {
        return devProceName;
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
    public void setDevProducNamet(String devProducNamet) {
        this.devProducNamet = devProducNamet;
    }

    /**
     * 获取：生产线名称
     */
    public String getDevProducNamet() {
        return devProducNamet;
    }
    /**
     * 设置：设备状态  0报废 1完好在用 2闲置 
     */
    public void setDevStatus(Integer devStatus) {
        this.devStatus = devStatus;
    }

    /**
     * 获取：设备状态  0报废 1完好在用 2闲置 
     */
    public Integer getDevStatus() {
        return devStatus;
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
     * 设置：数量
     */
    public void setDevNum(Integer devNum) {
        this.devNum = devNum;
    }

    /**
     * 获取：数量
     */
    public Integer getDevNum() {
        return devNum;
    }
    /**
     * 设置：型号
     */
    public void setDevModel(String devModel) {
        this.devModel = devModel;
    }

    /**
     * 获取：型号
     */
    public String getDevModel() {
        return devModel;
    }
    /**
     * 设置：原因
     */
    public void setReson(String reson) {
        this.reson = reson;
    }

    /**
     * 获取：原因
     */
    public String getReson() {
        return reson;
    }
    /**
     * 设置：状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取：状态
     */
    public String getStatus() {
        return status;
    }
    /**
     * 设置：地点
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取：地点
     */
    public String getAddress() {
        return address;
    }
    /**
     * 设置：使用单位
     */
    public void setUseUnit(String useUnit) {
        this.useUnit = useUnit;
    }

    /**
     * 获取：使用单位
     */
    public String getUseUnit() {
        return useUnit;
    }
    /**
     * 设置：净值
     */
    public void setNetVal(String netVal) {
        this.netVal = netVal;
    }

    /**
     * 获取：净值
     */
    public String getNetVal() {
        return netVal;
    }
    /**
     * 设置：原值
     */
    public void setOrigVal(String origVal) {
        this.origVal = origVal;
    }

    /**
     * 获取：原值
     */
    public String getOrigVal() {
        return origVal;
    }
    /**
     * 设置：启用日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取：启用日期
     */
    public Date getStartDate() {
        return startDate;
    }
    /**
     * 设置：更新日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取：更新日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }
    /**
     * 设置：更新者ID
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取：更新者ID
     */
    public String getUpdateUser() {
        return updateUser;
    }
    /**
     * 设置：创建者ID
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取：创建者ID
     */
    public String getCreateUser() {
        return createUser;
    }
    /**
     * 设置：上传日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取：上传日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    public String getSubFactory() {
        return subFactory;
    }

    public void setSubFactory(String subFactory) {
        this.subFactory = subFactory;
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public String getDevProducName() {
        return devProducName;
    }

    public void setDevProducName(String devProducName) {
        this.devProducName = devProducName;
    }
}
