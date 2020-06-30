package com.yz.bitedao.report.LoopholeResult;


import java.util.List;



/**
 * 2019/12/11
 * 创建人:yz
 */
public class LoopholeAndCveResultVO {
    public ScanningResults scanningResults;
    public List<LoopholeResultVO> loopholeResultVOS;
    public List<CveVO> cveVOList;
	
    public ScanningResults getScanningResults() {
		return scanningResults;
	}
	public void setScanningResults(ScanningResults scanningResults) {
		this.scanningResults = scanningResults;
	}
	public List<LoopholeResultVO> getLoopholeResultVOS() {
		return loopholeResultVOS;
	}
	public void setLoopholeResultVOS(List<LoopholeResultVO> loopholeResultVOS) {
		this.loopholeResultVOS = loopholeResultVOS;
	}
	public List<CveVO> getCveVOList() {
		return cveVOList;
	}
	public void setCveVOList(List<CveVO> cveVOList) {
		this.cveVOList = cveVOList;
	}
    
}
