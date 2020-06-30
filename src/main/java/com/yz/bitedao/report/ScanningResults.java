package com.yz.bitedao.report;


import java.util.Date;
public class ScanningResults {
    //扫描对象
    private String scanningObject;
    //版本
    private String edition;
    //版本描述
    private String remark;
    //'apk_a','apk_b','apk_c','java','python'
    private String pattern;
    //功能
    private String function;
    //单位
    private String company;
    //渠道
    private String channels;
    public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	//组件ID
    private String assemblyId;
    //扫描时间
    private Date scanningTime;
	public String getScanningObject() {
		return scanningObject;
	}
	public void setScanningObject(String scanningObject) {
		this.scanningObject = scanningObject;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getChannels() {
		return channels;
	}
	public void setChannels(String channels) {
		this.channels = channels;
	}
	public String getAssemblyId() {
		return assemblyId;
	}
	public void setAssemblyId(String assemblyId) {
		this.assemblyId = assemblyId;
	}
	public Date getScanningTime() {
		return scanningTime;
	}
	public void setScanningTime(Date scanningTime) {
		this.scanningTime = scanningTime;
	}
    
}