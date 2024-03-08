package com.example.Sortilegios.Weasley.Domain.Service;

import com.example.Sortilegios.Weasley.Domain.Dto.Purchase;

import java.util.List;

public interface PurchaseService {

    List<Purchase> getAll();
    Purchase save(Purchase purchase);

}
