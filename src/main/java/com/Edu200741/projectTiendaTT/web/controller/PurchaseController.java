package com.Edu200741.projectTiendaTT.web.controller;

import com.Edu200741.projectTiendaTT.domain.dto.CustomerDTO;
import com.Edu200741.projectTiendaTT.domain.dto.PurchaseDTO;
import com.Edu200741.projectTiendaTT.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purServ;

    @GetMapping("/all")
    public ResponseEntity<List<PurchaseDTO>> getAll() {

        return new ResponseEntity<>(purServ.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public PurchaseDTO savePurchase(@RequestBody PurchaseDTO compra){
        return purServ.purchaseSave(compra);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePurchase(@PathVariable int id){
        purServ.deleteById(id);
    }

}
