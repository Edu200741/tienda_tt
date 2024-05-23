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
            @Mapping(source = "apellidos",target = "lastName")
    })
    CustomerDTO clientesToCustomerDTO(Clientes clientes);
    List<CustomerDTO> toCustomer(List<Clientes> clientes);
    @InheritInverseConfiguration
    Clientes customerDTOToClientes(CustomerDTO customerDTO);
}
