package com.yz.bitedao.entity.dto;

import com.sugon.entity.MaterialBaseEntity;
import com.sugon.entity.MaterialRecordEntity;

import java.util.List;

/**
 * @description: 领料单VO
 * @author: YuXD
 * @create: 2020-04-26 18:59
 **/
public class PickListDTO extends MaterialBaseEntity {

    /**
     * 领料单对应的备件领料明细
     */
    private List<MaterialRecordEntity> materialItems;

    public List<MaterialRecordEntity> getMaterialItems() {
        return materialItems;
    }

    public void setMaterialItems(List<MaterialRecordEntity> materialItems) {
        this.materialItems = materialItems;
    }

}
