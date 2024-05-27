package com.Edu200741.projectTiendaTT.domain.dto;

import com.Edu200741.projectTiendaTT.persistance.entity.Categoria;
import com.Edu200741.projectTiendaTT.persistance.entity.CompraProducto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {

    private Integer productId;


    private String name;

    private Integer categoryId;

    //private Categoria category;

    private Integer price;

    private Integer stock;

    private Boolean state;


}
