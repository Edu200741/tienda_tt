package com.Edu200741.projectTiendaTT.domain.dto;

import com.Edu200741.projectTiendaTT.persistance.entity.Categoria;
import com.Edu200741.projectTiendaTT.persistance.entity.CompraProducto;

import java.util.List;

public class ProductDTO {

    private Integer productId;


    private String name;

    private Integer categoryId;

    private Categoria category;

    private Integer price;

    private Integer stock;

    private Boolean state;

    public ProductDTO() {
    }

    public ProductDTO(Integer productId, String name, Integer categoryId, Categoria category, Integer price, Integer stock, Boolean state) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.category = category;
        this.price = price;
        this.stock = stock;
        this.state = state;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Categoria getCategory() {
        return category;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
