package com.neu.infofinal.bean;

import java.util.Date;

public class OrderHousework {
    private Integer id;

    private Integer tenantId;

    private Integer houseId;

    private Integer managerId;

    private Integer enterpriseId;

    private Integer workderId;

    private Integer houseworkOrderType;

    private String status;

    private Date date;

    private String comment;

    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getWorkderId() {
        return workderId;
    }

    public void setWorkderId(Integer workderId) {
        this.workderId = workderId;
    }

    public Integer getHouseworkOrderType() {
        return houseworkOrderType;
    }

    public void setHouseworkOrderType(Integer houseworkOrderType) {
        this.houseworkOrderType = houseworkOrderType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
    
}