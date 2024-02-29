package com.example.Sortilegios.Weasley.Web.Controller;

import com.example.Sortilegios.Weasley.Domain.Dto.Purchase;
import com.example.Sortilegios.Weasley.Domain.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/purchase")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getAll(){
        return ResponseEntity.ok(purchaseService.getAll());
    }
}
