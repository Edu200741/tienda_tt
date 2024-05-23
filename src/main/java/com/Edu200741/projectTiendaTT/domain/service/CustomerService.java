package com.Edu200741.projectTiendaTT.domain.service;

import com.Edu200741.projectTiendaTT.domain.dto.CustomerDTO;
import com.Edu200741.projectTiendaTT.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    public List<CustomerDTO> getAll(){

        return customerRepo.getAll();
    }
    public CustomerDTO CustomerSave(CustomerDTO customerDTO){

        return customerRepo.CustomerSave(customerDTO);
    }
    public void deleteById(int id){
        customerRepo.deleteById(id);
    }

    public CustomerDTO findByName(String name){

        return customerRepo.findByName(name);
    }



}
