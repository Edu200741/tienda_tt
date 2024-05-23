package com.Edu200741.projectTiendaTT.domain.repository;

import com.Edu200741.projectTiendaTT.domain.dto.PurchaseDTO;

import java.util.List;

public interface PurchaseRepository {

    public List<PurchaseDTO> getAll();

    public void deleteById(int id);

    public PurchaseDTO purchaseSave(PurchaseDTO purchaseDTO);

    List<PurchaseDTO> findByPaymentsMethod(String payment);
}
