package com.Edu200741.projectTiendaTT.persistance.mappers;

import com.Edu200741.projectTiendaTT.domain.dto.CategoryDTO;
import com.Edu200741.projectTiendaTT.persistance.entity.Categoria;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria",target ="categoryId"),
            @Mapping(source = " descripcion",target ="description"),
            @Mapping(source = "estado",target ="state"),
            @Mapping(source = "productos",target ="products")
    })
    CategoryDTO categoriaToCategoriaDTO(Categoria categoria);
    List<CategoryDTO> toCategory(List<Categoria>categoria);

    @InheritInverseConfiguration
    Categoria categoryDTOtoCategoria(CategoryDTO categoryDTO);
}
