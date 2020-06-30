package com.yz.bitedao.report.LoopholeResult;


import java.util.Date;

import Submitted.entity.LoopholetVO;

public class LoopholeList {
    private Integer id;
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
    //入库时间
    private Date creatTime;
    //CVE列表
    private String cveList;
    //活跃值
    private Integer activeNumber;

    private String remark;

    public LoopholeList() {
    }
    
    public LoopholeList(LoopholetVO loopholetVO) {
        this.name = loopholetVO.getName();
        this.edition = loopholetVO.getEdition();
        this.cveList = loopholetVO.getCveNum();
        this.category = loopholetVO.getCategory();
        this.lastUpdataTime = loopholetVO.getLastUpdataTime();
        this.pattern = loopholetVO.getPattern();
        this.activeNumber = loopholetVO.getActiveNumber();
        this.remark = loopholetVO.getRemark();
        this.creatTime = new Date();
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

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getCveList() {
		return cveList;
	}

	public void setCveList(String cveList) {
		this.cveList = cveList;
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