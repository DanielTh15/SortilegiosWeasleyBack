package com.example.Sortilegios.Weasley.Persistence.Mapper;

import com.example.Sortilegios.Weasley.Domain.Dto.PurchaseItem;
import com.example.Sortilegios.Weasley.Persistence.Entity.CompraArticulo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseItemMapper {
    @Mappings({
            @Mapping(source = "id.id", target = "id"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "total", target = "total"),
    })

    PurchaseItem toPruchaseItem(CompraArticulo compraArticulo);
    List<PurchaseItem> toPruchasesItem(List<CompraArticulo> compraArticulo);
    @InheritInverseConfiguration
    CompraArticulo toCompraArticulo(PurchaseItem purchaseItem);
}
