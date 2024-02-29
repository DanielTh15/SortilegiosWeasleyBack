package com.example.Sortilegios.Weasley.Persistence.Mapper;

import com.example.Sortilegios.Weasley.Domain.Dto.Purchase;
import com.example.Sortilegios.Weasley.Persistence.Entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseMapper {

    @Mappings({
            @Mapping(source = "idFactura", target = "billId"),
            @Mapping(source = "medioDePAgo", target = "paymentMethod"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "idMag", target = "witcherId"),

    })
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases(List<Compra> compras);
    @InheritInverseConfiguration
    Compra toCompra(Purchase purchase);
}
