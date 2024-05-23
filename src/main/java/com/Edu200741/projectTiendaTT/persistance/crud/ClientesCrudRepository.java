package com.Edu200741.projectTiendaTT.persistance.crud;

import com.Edu200741.projectTiendaTT.persistance.entity.Clientes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientesCrudRepository extends CrudRepository<Clientes,String> {

    List<Clientes> findByapellidos(String apellido);

}
