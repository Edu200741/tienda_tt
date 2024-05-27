package com.Edu200741.projectTiendaTT.web.controller;

import com.Edu200741.projectTiendaTT.domain.dto.CategoryDTO;
import com.Edu200741.projectTiendaTT.domain.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService cateServ;

    @GetMapping("/all")
    public ResponseEntity<List<CategoryDTO>> getAll(){
        return new ResponseEntity<>(cateServ.getAll() , HttpStatus.OK);
    }
}
