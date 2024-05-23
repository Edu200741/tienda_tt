package com.Edu200741.projectTiendaTT.persistance.crud;

import com.Edu200741.projectTiendaTT.persistance.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
    List<Producto> findByIdCategoria(int id);

    List<Producto> findByCantidadStockLessThan(int id);
}
