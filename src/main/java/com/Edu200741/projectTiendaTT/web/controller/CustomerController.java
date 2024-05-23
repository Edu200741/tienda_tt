package com.Edu200741.projectTiendaTT.web.controller;

import com.Edu200741.projectTiendaTT.domain.dto.CustomerDTO;
import com.Edu200741.projectTiendaTT.domain.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerSer;


   @GetMapping("/all")
    public ResponseEntity<List<CustomerDTO>> getAll(){

       return new ResponseEntity<>(customerSer.getAll(), HttpStatus.OK);
    }



}
