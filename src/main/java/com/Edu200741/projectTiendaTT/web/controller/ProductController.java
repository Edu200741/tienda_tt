package com.Edu200741.projectTiendaTT.web.controller;

import com.Edu200741.projectTiendaTT.domain.dto.ProductDTO;
import com.Edu200741.projectTiendaTT.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productSer;

    @GetMapping("/all")
    public ResponseEntity<List<ProductDTO>> getAll(){
        return new ResponseEntity<>(productSer.getAll(), HttpStatus.OK);

    }

    @PostMapping("/save")
    public ProductDTO save(@RequestBody ProductDTO product){

        return productSer.saveProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id){

        productSer.deleteById(id);
    }

    @GetMapping("/findCategory/{id}")
    public List<ProductDTO> findCategoria(@PathVariable int id){

        return productSer.findByCategory(id);
    }

    @GetMapping("/stock/{id}")
    public ResponseEntity<List<ProductDTO>> getScareProduct(@PathVariable("id") int id) {
        List<ProductDTO> products = productSer.getScarseProduct(id);
        if (products.size() > 0) {
            return new ResponseEntity<>(products, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }

}
