package com.example.demo.model;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

public class OrderCriteria extends Criteria implements Serializable {
    private static final long serialVersionUID = 2114364735901216606L;
    private Long id;
    private Long orderId;
    private String outId;
    private Long buyerId;
    private String mobile;
    private Long shopId;
    private String shopName;
    private Long companyId;
    private List<Integer> status;
    private String statusStr;
    private Integer type;
    private Boolean invoiced;
    private Boolean commented;
    private Integer pageNo;
    private Integer size;
    private Date startAt;
    private Date endAt;
    private Integer skuOrderLimit = -1;

    public OrderCriteria() {
    }


    public void transformShopOrderId() {
        if (!CollectionUtils.isEmpty(this.status)) {
            this.orderId = this.id;
            this.id = null;
        }

    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOutId() {
        return this.outId;
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public Long getBuyerId() {
        return this.buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Long getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public List<Integer> getStatus() {
        return this.status;
    }

    public void setStatus(List<Integer> status) {
        this.status = status;
    }

    public String getStatusStr() {
        return this.statusStr;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getInvoiced() {
        return this.invoiced;
    }

    public void setInvoiced(Boolean invoiced) {
        this.invoiced = invoiced;
    }

    public Boolean getCommented() {
        return this.commented;
    }

    public void setCommented(Boolean commented) {
        this.commented = commented;
    }

    public Integer getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Date getStartAt() {
        return this.startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return this.endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Integer getSkuOrderLimit() {
        return this.skuOrderLimit;
    }

    public void setSkuOrderLimit(Integer skuOrderLimit) {
        this.skuOrderLimit = skuOrderLimit;
    }
}
