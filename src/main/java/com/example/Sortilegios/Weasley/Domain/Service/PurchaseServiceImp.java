package com.example.Sortilegios.Weasley.Domain.Service;

import com.example.Sortilegios.Weasley.Domain.Dto.Purchase;
import com.example.Sortilegios.Weasley.Domain.Repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseServiceImp implements PurchaseService{

    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseServiceImp(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }
    @Override
    public List<Purchase> getAll() {
        return purchaseRepository.getAll();
    }

    @Override
    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }
}
