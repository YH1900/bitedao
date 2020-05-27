package com.yz.bitedao.entity.dto;

/**
 * @description: ERP备件数据DTO
 * @author: YuXD
 * @create: 2020-04-26 13:58
 **/
public class ErpSparePartDataDTO {

    /**
     * 备件编号，相当于ERMS中的ErpCode
     */
    private String moqItemCode;

    /**
     * 备件编号，相当于ERMS中的ErpCode
     */
    private String spareCode;

    /**
     * 设备管理系统中的仓库ID
     * 由系统回填
     */
    private String moqSubId;

    /**
     * 仓库编码
     */
    private String moqSubCode;

    /**
     * 库位编码
     */
    private String moqLocatorCode;

    /**
     * 现有库存
     */
    private Integer moqQty;

    public String getMoqItemCode() {
        return moqItemCode;
    }

    public void setMoqItemCode(String moqItemCode) {
        this.moqItemCode = moqItemCode;
    }

    public String getMoqSubCode() {
        return moqSubCode;
    }

    public void setMoqSubCode(String moqSubCode) {
        this.moqSubCode = moqSubCode;
    }

    public String getMoqLocatorCode() {
        return moqLocatorCode;
    }

    public void setMoqLocatorCode(String moqLocatorCode) {
        this.moqLocatorCode = moqLocatorCode;
    }

    public Integer getMoqQty() {
        return moqQty;
    }

    public void setMoqQty(Integer moqQty) {
        this.moqQty = moqQty;
    }

    public String getMoqSubId() {
        return moqSubId;
    }

    public void setMoqSubId(String moqSubId) {
        this.moqSubId = moqSubId;
    }

    public String getSpareCode() {
        return spareCode;
    }

    public void setSpareCode(String spareCode) {
        this.spareCode = spareCode;
    }
}
