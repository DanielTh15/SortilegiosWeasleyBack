package com.example.Sortilegios.Weasley.Persistence.Mapper;

import com.example.Sortilegios.Weasley.Domain.Dto.Witcher;
import com.example.Sortilegios.Weasley.Persistence.Entity.Mago;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PurchaseMapper.class})
public interface WitcherMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "celular", target = "phoneNumber"),
            @Mapping(source = "correo", target = "mail"),
            @Mapping(source = "compraList", target = "purchaseList")

    })
    Witcher toWitcher(Mago mago);
    List<Witcher> toWitchers(List<Mago> magos);
    @InheritInverseConfiguration
    Mago toMago(Witcher witcher);
}
