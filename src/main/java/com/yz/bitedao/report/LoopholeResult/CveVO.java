package com.yz.bitedao.report.LoopholeResult;


/**
 * 2019/12/11
 * 创建人:yz
 */
public class CveVO {
    private Integer id;

    private String cveNumber;

    private String vulnerabilityStatus;

    private String vulnerabilityScore;

    private String vulnerabilityLevel;

    private String vulnerabilityDescription;

    private String describingSinicization;

    private String belongSDK;

    public CveVO() {
    }

    public CveVO(String cveNumber, String vulnerabilityStatus, String vulnerabilityScore, String vulnerabilityLevel,
			String vulnerabilityDescription, String describingSinicization, String belongSDK) {
		super();
		this.cveNumber = cveNumber;
		this.vulnerabilityStatus = vulnerabilityStatus;
		this.vulnerabilityScore = vulnerabilityScore;
		this.vulnerabilityLevel = vulnerabilityLevel;
		this.vulnerabilityDescription = vulnerabilityDescription;
		this.describingSinicization = describingSinicization;
		this.belongSDK = belongSDK;
	}

	public CveVO(CVEList cveList, String belongSDK) {
        this.id = cveList.getId();
        this.cveNumber = cveList.getCveNumber();
        this.vulnerabilityStatus = cveList.getVulnerabilityStatus();
        this.vulnerabilityScore = cveList.getVulnerabilityScore();
        this.vulnerabilityLevel = cveList.getVulnerabilityLevel();
        this.vulnerabilityDescription = cveList.getVulnerabilityDescription();
        this.describingSinicization = cveList.getDescribingSinicization();
        this.belongSDK = belongSDK;
    }

	@Override
	public String toString() {
		return "CveVO [id=" + id + ", cveNumber=" + cveNumber + ", vulnerabilityStatus=" + vulnerabilityStatus
				+ ", vulnerabilityScore=" + vulnerabilityScore + ", vulnerabilityLevel=" + vulnerabilityLevel
				+ ", vulnerabilityDescription=" + vulnerabilityDescription + ", describingSinicization="
				+ describingSinicization + ", belongSDK=" + belongSDK + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCveNumber() {
		return cveNumber;
	}

	public void setCveNumber(String cveNumber) {
		this.cveNumber = cveNumber;
	}

	public String getVulnerabilityStatus() {
		return vulnerabilityStatus;
	}

	public void setVulnerabilityStatus(String vulnerabilityStatus) {
		this.vulnerabilityStatus = vulnerabilityStatus;
	}

	public String getVulnerabilityScore() {
		return vulnerabilityScore;
	}

	public void setVulnerabilityScore(String vulnerabilityScore) {
		this.vulnerabilityScore = vulnerabilityScore;
	}

	public String getVulnerabilityLevel() {
		return vulnerabilityLevel;
	}

	public void setVulnerabilityLevel(String vulnerabilityLevel) {
		this.vulnerabilityLevel = vulnerabilityLevel;
	}

	public String getVulnerabilityDescription() {
		return vulnerabilityDescription;
	}

	public void setVulnerabilityDescription(String vulnerabilityDescription) {
		this.vulnerabilityDescription = vulnerabilityDescription;
	}

	public String getDescribingSinicization() {
		return describingSinicization;
	}

	public void setDescribingSinicization(String describingSinicization) {
		this.describingSinicization = describingSinicization;
	}

	public String getBelongSDK() {
		return belongSDK;
	}

	public void setBelongSDK(String belongSDK) {
		this.belongSDK = belongSDK;
	}
    
}
