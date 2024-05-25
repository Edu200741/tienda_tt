package com.Edu200741.projectTiendaTT.domain.repository;

import com.Edu200741.projectTiendaTT.domain.dto.ProductDTO;
import com.Edu200741.projectTiendaTT.persistance.entity.Categoria;

import java.util.List;

public interface ProductRepository {

    public List<ProductDTO> getAll();

    public List<ProductDTO> findByCategory(int id);

    public void deleteById(int id);

    public List<ProductDTO> getScarseProduct(int id);

    public ProductDTO productSave(ProductDTO product);
}
