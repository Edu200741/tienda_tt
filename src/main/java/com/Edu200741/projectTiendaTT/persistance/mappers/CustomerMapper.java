package com.Edu200741.projectTiendaTT.persistance.mappers;

import com.Edu200741.projectTiendaTT.domain.dto.CustomerDTO;
import com.Edu200741.projectTiendaTT.persistance.entity.Clientes;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "apellidos",target = "lastName"),
            @Mapping(source = "celular",target = "cell"),
            @Mapping(source = "direccion",target = "address"),
            @Mapping(source = "correoElectronico",target = "email")
    })
    CustomerDTO clientesToCustomerDTO(Clientes clientes);
    List<CustomerDTO> toCustomer(List<Clientes> cliente);

    @InheritInverseConfiguration
    Clientes customerDTOToClientes(CustomerDTO customerDTO);
   // List<Clientes> toCustomerDTO(List<CustomerDTO> clien);
}
