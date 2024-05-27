package com.Edu200741.projectTiendaTT.domain.service;

import com.Edu200741.projectTiendaTT.domain.dto.CategoryDTO;
import com.Edu200741.projectTiendaTT.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    public List<CategoryDTO> getAll(){
        return categoryRepo.getAll();
    }
    public CategoryDTO saveCategory(CategoryDTO categoryDTO){
        return categoryRepo.saveCategory(categoryDTO);
    }

    public void deleteCategory(int id){
        categoryRepo.deleteCategory(id);
    }
}
