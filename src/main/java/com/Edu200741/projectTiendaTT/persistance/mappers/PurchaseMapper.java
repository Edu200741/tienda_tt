package com.Edu200741.projectTiendaTT.persistance.mappers;

import com.Edu200741.projectTiendaTT.domain.dto.PurchaseDTO;
import com.Edu200741.projectTiendaTT.persistance.entity.Compra;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source = "idCompra",target = "purchaseId"),
            @Mapping(source = "idCliente",target = "customerId"),
            @Mapping(source = "fecha",target = "date"),
            @Mapping(source = "medioPago",target = "paymenth"),
            @Mapping(source = "productos",target = "products"),

    })

    PurchaseDTO compraToPurchaseDTO(Compra compra);
    List<PurchaseDTO> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    Compra purchaseDTOToCompra(PurchaseDTO purchaseDTO);

    @Mapping(target = "estado", ignore = true)
    Compra toCompra(PurchaseDTO purchase);

}


