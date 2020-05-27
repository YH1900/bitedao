package com.yz.bitedao.entity.dto;


import java.util.Date;

/**
 * @description: 领料明细DTO
 * @author: YuXD
 * @create: 2020-04-26 19:00
 **/
public class ErpPickItemDTO {

    /**
     * 备件编号
     */
    private String materiasCode;

    /**
     * 出库数目
     */
    private Integer quantity;

    /**
     * 出库日期
     */
    private Date outDate;

    /**
     * 物料单明细项，回填的
     */

    public String getMateriasCode() {
        return materiasCode;
    }

    public void setMateriasCode(String materiasCode) {
        this.materiasCode = materiasCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = Integer.parseInt(quantity);
    }

    public Date getOutDate() {
        return outDate;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

}
