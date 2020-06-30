package com.yz.bitedao.report.LoopholeResult;

import java.util.Date;

public class LoopholetVO {
    //名称
    private String name;
    //版本
    private String edition;
    //类型 开源组件 商业组件 Android框架
    private String category;
    //'apk_a','apk_b','apk_c','java','python'
    private String pattern;
    //最后更新时间
    private Date lastUpdataTime;
    //CVE列表
    private String cveNum;
    //活跃值
    private Integer activeNumber;

    private String remark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public Date getLastUpdataTime() {
		return lastUpdataTime;
	}

	public void setLastUpdataTime(Date lastUpdataTime) {
		this.lastUpdataTime = lastUpdataTime;
	}

	public String getCveNum() {
		return cveNum;
	}

	public void setCveNum(String cveNum) {
		this.cveNum = cveNum;
	}

	public Integer getActiveNumber() {
		return activeNumber;
	}

	public void setActiveNumber(Integer activeNumber) {
		this.activeNumber = activeNumber;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
    

}