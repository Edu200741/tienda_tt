package com.Edu200741.projectTiendaTT.persistance;

import com.Edu200741.projectTiendaTT.domain.dto.PurchaseDTO;
import com.Edu200741.projectTiendaTT.persistance.crud.CompraCrudRepository;
import com.Edu200741.projectTiendaTT.persistance.entity.Compra;
import com.Edu200741.projectTiendaTT.persistance.mappers.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CompraRepository implements com.Edu200741.projectTiendaTT.domain.repository.PurchaseRepository {


    @Autowired
    private CompraCrudRepository compraRepo;

    @Autowired
    private PurchaseMapper purchaseMapper;


    @Override
    public List<PurchaseDTO> getAll() {

        return purchaseMapper.toPurchases((List<Compra>) compraRepo.findAll());
    }

    @Override
    public void deleteById(int id) {
       compraRepo.deleteById(id);
    }

    @Override
    public PurchaseDTO purchaseSave(PurchaseDTO purchaseDTO) {
        Compra compra = purchaseMapper.toCompra(purchaseDTO);
        return purchaseMapper.compraToPurchaseDTO(compraRepo.save(compra));
    }

    @Override
    public List<PurchaseDTO> findByPaymentsMethod(String payment) {

        return purchaseMapper.toPurchases( compraRepo.findByMedioPago(payment));
    }
}
