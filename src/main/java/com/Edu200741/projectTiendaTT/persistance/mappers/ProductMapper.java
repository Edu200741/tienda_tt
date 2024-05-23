package com.Edu200741.projectTiendaTT.persistance.mappers;

import com.Edu200741.projectTiendaTT.domain.dto.ProductDTO;
import com.Edu200741.projectTiendaTT.persistance.entity.Producto;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto" , target = "productId"),
            @Mapping(source = "nombre" , target = "name"),
            @Mapping(source = "idCategoria" , target = "categoryId"),
            @Mapping(source = "categoria" , target = "category"),
            @Mapping(source = "precioVenta" , target = "price"),
            @Mapping(source = "cantidadStock" , target = "stock"),
            @Mapping(source = "estado" , target = "state")

    })

    ProductDTO productoToProductDTO(Producto product);
    List<ProductDTO> toProducts(List<Producto> productos);
    @InheritInverseConfiguration
    Producto productDTOToProducto(ProductDTO productDTO);


}


