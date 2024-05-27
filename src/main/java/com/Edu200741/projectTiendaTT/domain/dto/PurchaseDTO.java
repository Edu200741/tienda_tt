package com.Edu200741.projectTiendaTT.domain.dto;

import com.Edu200741.projectTiendaTT.persistance.entity.CompraProducto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PurchaseDTO {

    private Integer purchaseId;
    private Integer customerId;
    private LocalDateTime date;
    private String paymenth;

    private List<CompraProducto> products;

}
