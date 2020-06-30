package com.yz.bitedao.report.LoopholeResult;


import java.util.List;

import report.LoopholeResult.CveVO;

/**
 * 2019/7/18
 * 创建人:yz
 */
public class InsertScanResultsVO {
    private List<LoopholetVO> loopholetVOList;
    private ScanningResults scanningResults;
	private List<CveVO> cvelist;
	
    public List<CveVO> getCvelist() {
		return cvelist;
	}
	public void setCvelist(List<CveVO> cvelist) {
		this.cvelist = cvelist;
	}
	public List<LoopholetVO> getLoopholetVOList() {
		return loopholetVOList;
	}
	public void setLoopholetVOList(List<LoopholetVO> loopholetVOList) {
		this.loopholetVOList = loopholetVOList;
	}
	public ScanningResults getScanningResults() {
		return scanningResults;
	}
	public void setScanningResults(ScanningResults scanningResults) {
		this.scanningResults = scanningResults;
	}
    
}
