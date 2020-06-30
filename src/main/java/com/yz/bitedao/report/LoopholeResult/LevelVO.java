package com.yz.bitedao.report.LoopholeResult;


/**
 * 2019/12/10
 * 创建人:yz
 */
public class LevelVO {
    private Integer LowNum;
    private Integer MedNum;
    private Integer HeiNum;
    public LevelVO() {}
	public LevelVO(Integer lowNum, Integer medNum, Integer heiNum) {
		super();
		LowNum = lowNum;
		MedNum = medNum;
		HeiNum = heiNum;
	}
	@Override
	public String toString() {
		return "LevelVO [LowNum=" + LowNum + ", MedNum=" + MedNum + ", HeiNum=" + HeiNum + "]";
	}
	public Integer getLowNum() {
		return LowNum;
	}
	public void setLowNum(Integer lowNum) {
		LowNum = lowNum;
	}
	public Integer getMedNum() {
		return MedNum;
	}
	public void setMedNum(Integer medNum) {
		MedNum = medNum;
	}
	public Integer getHeiNum() {
		return HeiNum;
	}
	public void setHeiNum(Integer heiNum) {
		HeiNum = heiNum;
	}
    
}
