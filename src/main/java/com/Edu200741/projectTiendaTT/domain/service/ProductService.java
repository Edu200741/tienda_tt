package com.Edu200741.projectTiendaTT.domain.service;

import com.Edu200741.projectTiendaTT.domain.dto.ProductDTO;
import com.Edu200741.projectTiendaTT.domain.repository.ProductRepository;
import com.Edu200741.projectTiendaTT.persistance.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getAll(){

        return productRepository.getAll();
    }
    public ProductDTO saveProduct (ProductDTO productDTO){

        return productRepository.productSave(productDTO);
    }

    public List<ProductDTO> findByCategory(int id){

        return productRepository.findByCategory(id);
    }

    public void deleteById(int id){
        productRepository.deleteById(id);
    }

    public  List<ProductDTO> getScarseProduct(int id){

        return productRepository.getScarseProduct(id);
    }

}
