package com.yz.bitedao.report.LoopholeResult;

public class CVEList {
    private Integer id;

    private String cveNumber;

    private String vulnerabilityStatus;

    private String vulnerabilityScore;

    private String vulnerabilityLevel;

    private String vulnerabilityDescription;

    private String describingSinicization;

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
        this.cveNumber = cveNumber == null ? null : cveNumber.trim();
    }

    public String getVulnerabilityStatus() {
        return vulnerabilityStatus;
    }

    public void setVulnerabilityStatus(String vulnerabilityStatus) {
        this.vulnerabilityStatus = vulnerabilityStatus == null ? null : vulnerabilityStatus.trim();
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
        this.vulnerabilityLevel = vulnerabilityLevel == null ? null : vulnerabilityLevel.trim();
    }

    public String getVulnerabilityDescription() {
        return vulnerabilityDescription;
    }

    public void setVulnerabilityDescription(String vulnerabilityDescription) {
        this.vulnerabilityDescription = vulnerabilityDescription == null ? null : vulnerabilityDescription.trim();
    }

    public String getDescribingSinicization() {
        return describingSinicization;
    }

    public void setDescribingSinicization(String describingSinicization) {
        this.describingSinicization = describingSinicization == null ? null : describingSinicization.trim();
    }

    public CVEList() {
    }

    public CVEList(String cveNumber, String vulnerabilityStatus, String vulnerabilityScore, String vulnerabilityLevel, String vulnerabilityDescription, String describingSinicization) {
        this.cveNumber = cveNumber;
        this.vulnerabilityStatus = vulnerabilityStatus;
        this.vulnerabilityScore = vulnerabilityScore;
        this.vulnerabilityLevel = vulnerabilityLevel;
        this.vulnerabilityDescription = vulnerabilityDescription;
        this.describingSinicization = describingSinicization;
    }
}