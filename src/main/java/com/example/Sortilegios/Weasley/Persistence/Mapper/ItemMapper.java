package com.example.Sortilegios.Weasley.Persistence.Mapper;

import com.example.Sortilegios.Weasley.Domain.Dto.Item;
import com.example.Sortilegios.Weasley.Persistence.Entity.Articulo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "precioVenta", target = "salePrice"),
            @Mapping(source = "stock", target = "stock"),
            @Mapping(source = "idCategoria", target = "idCategory")
    })
    Item toItem(Articulo articulo);
    List<Item> toItem(List<Articulo> articulo);
    @InheritInverseConfiguration
    Articulo toArticulo(Item item);

}
