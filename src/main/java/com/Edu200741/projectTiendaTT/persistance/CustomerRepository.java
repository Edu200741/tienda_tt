package com.Edu200741.projectTiendaTT.persistance;

import com.Edu200741.projectTiendaTT.domain.dto.CustomerDTO;
import com.Edu200741.projectTiendaTT.persistance.crud.ClientesCrudRepository;
import com.Edu200741.projectTiendaTT.persistance.entity.Clientes;
import com.Edu200741.projectTiendaTT.persistance.mappers.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerRepository implements com.Edu200741.projectTiendaTT.domain.repository.CustomerRepository {

    @Autowired
    private ClientesCrudRepository clienteRepo;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<CustomerDTO> getAll() {

        return customerMapper.toCustomer((List<Clientes>) clienteRepo.findAll());
    }

    @Override
    public CustomerDTO CustomerSave(CustomerDTO customerDTO) {

        Clientes cliente = customerMapper.customerDTOToClientes(customerDTO);
        return customerMapper.clientesToCustomerDTO(clienteRepo.save(cliente));

    }

    @Override
    public void deleteById(int id) {
        clienteRepo.deleteById(String.valueOf(id));
    }

    @Override
    public CustomerDTO findByName(String name) {

        return (CustomerDTO) customerMapper.toCustomer((List<Clientes>) clienteRepo.findByapellidos(name));
    }
}
