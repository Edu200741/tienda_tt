package com.Edu200741.projectTiendaTT.persistance;

import com.Edu200741.projectTiendaTT.domain.dto.ProductDTO;
import com.Edu200741.projectTiendaTT.persistance.crud.ProductoCrudRepository;
import com.Edu200741.projectTiendaTT.persistance.entity.Categoria;
import com.Edu200741.projectTiendaTT.persistance.entity.Producto;
import com.Edu200741.projectTiendaTT.persistance.mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductoRepository implements com.Edu200741.projectTiendaTT.domain.repository.ProductRepository {

    @Autowired
    private ProductoCrudRepository productoRepo;

    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<ProductDTO> getAll() {


        return productMapper.toProducts((List<Producto>) productoRepo.findAll());
    }

    @Override
    public List<ProductDTO> findByCategory(Categoria category) {

        return productMapper.toProducts((List<Producto>) productoRepo.findByIdCategoria(category.getIdCategoria()));
    }

    @Override
    public void deleteById(int id) {
        productoRepo.deleteById(id);

    }

    @Override
    public List<ProductDTO> getScarseProduct(int id) {

        return productMapper.toProducts((List<Producto>)
                productoRepo.findByCantidadStockLessThan((id)));
    }

    @Override
    public ProductDTO productSave(ProductDTO product) {
        Producto producto = productMapper.productDTOToProducto(product);
        return productMapper.productoToProductDTO(productoRepo.save(producto));
    }
}
