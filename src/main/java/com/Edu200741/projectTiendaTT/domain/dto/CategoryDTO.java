package com.Edu200741.projectTiendaTT.domain.dto;

import com.Edu200741.projectTiendaTT.persistance.entity.Producto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTO {

    private Integer categoryId;

    private String description;

    private Boolean state;


    @JsonIgnore
    private List<Producto> products;



}
