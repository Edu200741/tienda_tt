package com.Edu200741.projectTiendaTT.domain.service;

import com.Edu200741.projectTiendaTT.domain.dto.PurchaseDTO;
import com.Edu200741.projectTiendaTT.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseSer;

    public List<PurchaseDTO> getAll(){
        return purchaseSer.getAll();
    }

    public void deleteById(int id){
        purchaseSer.deleteById(id);
    }

    public PurchaseDTO purchaseSave(PurchaseDTO purchaseDTO){

        return purchaseSer.purchaseSave(purchaseDTO);
    }

    List<PurchaseDTO> findByPaymentsMethod(String payment){
        return purchaseSer.findByPaymentsMethod(payment);
    }
}
