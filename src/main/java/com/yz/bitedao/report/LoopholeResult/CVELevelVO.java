package com.yz.bitedao.report.LoopholeResult;


/**
 * 2019/12/10
 * 创建人:yz
 */
public class CVELevelVO {
    private String CVENum;
    private String level;

    public CVELevelVO(String CVENum, String level) {
        this.CVENum = CVENum;
        this.level = level;
    }

	public String getCVENum() {
		return CVENum;
	}

	public void setCVENum(String cVENum) {
		CVENum = cVENum;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "CVELevelVO [CVENum=" + CVENum + ", level=" + level + "]";
	}
    
}
