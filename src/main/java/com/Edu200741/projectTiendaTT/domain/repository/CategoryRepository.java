package com.Edu200741.projectTiendaTT.domain.repository;

import com.Edu200741.projectTiendaTT.domain.dto.CategoryDTO;

import java.util.List;

public interface CategoryRepository {

   public List<CategoryDTO> getAll();
   public CategoryDTO saveCategory(CategoryDTO categoryDTO);

   public void deleteCategory(int id);


}
