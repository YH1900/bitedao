package com.yz.bitedao.entity.dto;

import java.util.List;

/**
 * @description: 领料单VO
 * @author: YuXD
 * @create: 2020-04-26 18:59
 **/
public class ErpPickListDTO {

    /**
     * 领料单号
     */
    private String pickListNo;

    /**
     * 领料明细
     */
    private List<ErpPickItemDTO> pickItems;

    public String getPickListNo() {
        return pickListNo;
    }

    public void setPickListNo(String pickListNo) {
        this.pickListNo = pickListNo;
    }

    public List<ErpPickItemDTO> getPickItems() {
        return pickItems;
    }

    public void setPickItems(List<ErpPickItemDTO> pickItems) {
        this.pickItems = pickItems;
    }
}
