package com.neu.infofinal.bean;

public class OrderHousework {
    private Integer id;

    private Integer tenantId;

    private Integer houseId;

    private Integer managerId;

    private Integer enterpriseId;

    private Integer workderId;

    private Integer houseworkOrderType;

    private Integer status;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}