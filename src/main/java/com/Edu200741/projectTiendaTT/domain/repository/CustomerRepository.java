package com.Edu200741.projectTiendaTT.domain.repository;

import com.Edu200741.projectTiendaTT.domain.dto.CustomerDTO;
import com.Edu200741.projectTiendaTT.persistance.entity.Clientes;

import java.util.List;

public interface CustomerRepository {

    public List<CustomerDTO> getAll();
    public CustomerDTO CustomerSave(CustomerDTO customerDTO);
    public void deleteById(int id);

    public CustomerDTO findByName(String name);
}
