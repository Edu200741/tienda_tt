package com.Edu200741.projectTiendaTT.domain.dto;

import com.Edu200741.projectTiendaTT.persistance.entity.CompraProducto;

import java.time.LocalDateTime;
import java.util.List;

public class PurchaseDTO {

    private Integer purchaseId;
    private Integer customerId;
    private LocalDateTime date;
    private String paymenth;

    private List<CompraProducto> products;

    public PurchaseDTO() {
    }

    public PurchaseDTO(Integer purchaseId, Integer customerId, LocalDateTime date, String paymenth, List<CompraProducto> products) {
        this.purchaseId = purchaseId;
        this.customerId = customerId;
        this.date = date;
        this.paymenth = paymenth;
        this.products = products;
    }

    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymenth() {
        return paymenth;
    }

    public void setPaymenth(String paymenth) {
        this.paymenth = paymenth;
    }

    public List<CompraProducto> getProducts() {
        return products;
    }

    public void setProducts(List<CompraProducto> products) {
        this.products = products;
    }
}
