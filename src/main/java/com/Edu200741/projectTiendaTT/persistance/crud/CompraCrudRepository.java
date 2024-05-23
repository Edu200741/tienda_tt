package com.Edu200741.projectTiendaTT.persistance.crud;

import com.Edu200741.projectTiendaTT.persistance.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompraCrudRepository extends CrudRepository<Compra,Integer> {

    List<Compra> findByMedioPago(String medioPago);
}
