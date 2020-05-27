package com.yz.bitedao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 附件表实体
 * 表名 ANNEX_FILE
 *
 * @author sugon
 * @date 2019-07-11 10:37:10
 */
public class AnnexFileEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 删除标识
     */
    private Integer delFlag;
    /**
     * 所属类型
     */
    private Integer type;
    /**
     * 文件类型
     */
    private Integer fileType;
    /**
     * 上传日期
     */
    private Date uploadDate;
    /**
     * 附件名称
     */
    private String fileName;

    /**
     * 附件真实名称
     */
    private String relName;

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    /**
     * 附件上传人名称
     */
    private String createUserName;
    /**
     * ID
     */
    private String id;
    /**
     * 文件
     */
    private String url;

    /**
     * 设置：删除标识
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取：删除标识
     */
    public Integer getDelFlag() {
        return delFlag;
    }
    /**
     * 设置：所属类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取：所属类型
     */
    public Integer getType() {
        return type;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    /**
     * 设置：上传日期
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * 获取：上传日期
     */
    public Date getUploadDate() {
        return uploadDate;
    }
    /**
     * 设置：附件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * 获取：附件名称
     */
    public String getFileName() {
        return fileName;
    }
    /**
     * 设置：ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取：ID
     */
    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRelName() {
        return relName;
    }

    public void setRelName(String relName) {
        this.relName = relName;
    }
}
