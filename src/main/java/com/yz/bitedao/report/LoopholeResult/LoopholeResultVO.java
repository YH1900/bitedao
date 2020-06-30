package com.yz.bitedao.report.LoopholeResult;


import java.util.Date;


public class LoopholeResultVO {
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
    //组件安全等级
    private String loopholeLevel;
    //漏洞数
    private LevelVO cveLevelNum;

    public LoopholeResultVO(LoopholeList loopholetVO, String loopholeLevel, LevelVO levelVO) {
        this.name = loopholetVO.getName();
        this.edition = loopholetVO.getEdition();
        this.category = loopholetVO.getCategory();
        this.lastUpdataTime = loopholetVO.getLastUpdataTime();
        this.pattern = loopholetVO.getPattern();
        this.loopholeLevel = loopholeLevel;
        this.cveLevelNum = levelVO;
    }
    public LoopholeResultVO(LoopholetVO loopholetVO, String loopholeLevel, LevelVO levelVO) {
        this.name = loopholetVO.getName();
        this.edition = loopholetVO.getEdition();
        this.category = loopholetVO.getCategory();
        this.lastUpdataTime = loopholetVO.getLastUpdataTime();
        this.pattern = loopholetVO.getPattern();
        this.loopholeLevel = loopholeLevel;
        this.cveLevelNum = levelVO;
    }
	@Override
	public String toString() {
		return "LoopholeResultVO [name=" + name + ", edition=" + edition + ", category=" + category + ", pattern="
				+ pattern + ", lastUpdataTime=" + lastUpdataTime + ", loopholeLevel=" + loopholeLevel + ", cveLevelNum="
				+ cveLevelNum + "]";
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

	public String getLoopholeLevel() {
		return loopholeLevel;
	}

	public void setLoopholeLevel(String loopholeLevel) {
		this.loopholeLevel = loopholeLevel;
	}

	public LevelVO getCveLevelNum() {
		return cveLevelNum;
	}

	public void setCveLevelNum(LevelVO cveLevelNum) {
		this.cveLevelNum = cveLevelNum;
	}

}