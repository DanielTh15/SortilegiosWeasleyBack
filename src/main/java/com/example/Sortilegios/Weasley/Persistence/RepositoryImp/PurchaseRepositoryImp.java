package com.example.Sortilegios.Weasley.Persistence.RepositoryImp;
import com.example.Sortilegios.Weasley.Domain.Dto.Purchase;
import com.example.Sortilegios.Weasley.Domain.Repository.PurchaseRepository;
import com.example.Sortilegios.Weasley.Persistence.Crud.CompraCrud;
import com.example.Sortilegios.Weasley.Persistence.Entity.Compra;
import com.example.Sortilegios.Weasley.Persistence.Mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PurchaseRepositoryImp implements PurchaseRepository{

    private final CompraCrud compraCrud;
    private final PurchaseMapper purchaseMapper;

    @Autowired
    public PurchaseRepositoryImp(CompraCrud compraCrud, PurchaseMapper purchaseMapper) {
        this.compraCrud = compraCrud;
        this.purchaseMapper = purchaseMapper;
    }

    @Override
    public List<Purchase> getAll() {
        List<Compra> compras = compraCrud.findAll();
        return purchaseMapper.toPurchases(compras);
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = purchaseMapper.toCompra(purchase);
        compra.getArticulos().forEach(compraArticulo -> compraArticulo.setCompra(compra));
        return purchaseMapper.toPurchase(compraCrud.save(compra));
    }
}
