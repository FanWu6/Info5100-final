package com.neu.infofinal.bean;

import java.util.List;

public class Employee {
    private Integer id;

    private Integer organizationId;

    private Integer enterpriseId;

    private String name;

    private Integer useraccountId;
    
    private List<UserAccount> useraccounts;

    public List<UserAccount> getUseraccounts() {
        return useraccounts;
    }

    public void setUseraccounts(List<UserAccount> useraccounts) {
        this.useraccounts = useraccounts;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getUseraccountId() {
        return useraccountId;
    }

    public void setUseraccountId(Integer useraccountId) {
        this.useraccountId = useraccountId;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", organizationId=" + organizationId + ", enterpriseId=" + enterpriseId + ", name=" + name + ", useraccountId=" + useraccountId + ", useraccounts=" + useraccounts + '}';
    }
    
    
}