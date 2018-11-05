package com.service;


import java.io.Serializable;
import java.util.List;

/**
 * @description:
 * @author: YuXD
 * @create: 2018-09-20 11:35
 **/
public class FiveBallHistoryDrawRecordVO implements Serializable {

    private static final long serialVersionUID = -3340509444673202901L;

    /**
     * 开奖期号
     */
    public String drawIssue;

    /**
     * 开奖时间
     */
    public String drawTime;

    public String getDrawIssue() {
        return drawIssue;
    }

    public void setDrawIssue(String drawIssue) {
        this.drawIssue = drawIssue;
    }

    public String getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(String drawTime) {
        this.drawTime = drawTime;
    }

    public List<Integer> getDrawNumbers() {
        return drawNumbers;
    }

    public void setDrawNumbers(List<Integer> drawNumbers) {
        this.drawNumbers = drawNumbers;
    }

    public List<Object> getGySum() {
        return gySum;
    }

    public void setGySum(List<Object> gySum) {
        this.gySum = gySum;
    }

    public List<String> getLhOne2Five() {
        return lhOne2Five;
    }

    public void setLhOne2Five(List<String> lhOne2Five) {
        this.lhOne2Five = lhOne2Five;
    }

    public List<Object> getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(List<Object> totalSum) {
        this.totalSum = totalSum;
    }

    public String getLonghu() {
        return longhu;
    }

    public void setLonghu(String longhu) {
        this.longhu = longhu;
    }

    public String getQiansan() {
        return qiansan;
    }

    public void setQiansan(String qiansan) {
        this.qiansan = qiansan;
    }

    public String getZhongsan() {
        return zhongsan;
    }

    public void setZhongsan(String zhongsan) {
        this.zhongsan = zhongsan;
    }

    public String getHousan() {
        return housan;
    }

    public void setHousan(String housan) {
        this.housan = housan;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * 开奖号码
     */
    public List<Integer> drawNumbers;

    /** 开奖号码为十个时用 **/
    /**
     * 冠亚军和
     */
    private List<Object> gySum;

    /**
     * 1~5龙虎
     */
    private List<String> lhOne2Five;


    /** 开奖号码为5个时用 **/
    /**
     * 总和：总和、单双、大小
     */
    private List<Object> totalSum;

    /**
     * 龙虎：总和是龙还是虎
     */
    private String longhu;

    /**
     * 前三
     */
    private String qiansan;

    /**
     * 中三
     */
    private String zhongsan;

    /**
     * 后三
     */
    private String housan;

}
