package com.Edu200741.projectTiendaTT.persistance;

import com.Edu200741.projectTiendaTT.domain.dto.CategoryDTO;
import com.Edu200741.projectTiendaTT.domain.repository.CategoryRepository;
import com.Edu200741.projectTiendaTT.persistance.crud.CategoriaCrudRepository;
import com.Edu200741.projectTiendaTT.persistance.entity.Categoria;
import com.Edu200741.projectTiendaTT.persistance.mappers.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CategoriaRepository implements CategoryRepository {

    @Autowired
    private CategoriaCrudRepository cateRepo;

    @Autowired
    private CategoryMapper cateMapper;

    @Override
    public List<CategoryDTO> getAll() {
        return cateMapper.toCategory((List<Categoria>) cateRepo.findAll());
    }

    @Override
    public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
        Categoria categoria = cateMapper.categoryDTOtoCategoria(categoryDTO);
        return cateMapper.categoriaToCategoriaDTO(cateRepo.save(categoria));
    }

    @Override
    public void deleteCategory(int id) {
        cateRepo.deleteById(id);
    }
}
