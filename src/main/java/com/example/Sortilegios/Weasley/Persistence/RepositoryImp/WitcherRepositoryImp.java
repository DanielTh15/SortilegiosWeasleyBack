package com.example.Sortilegios.Weasley.Persistence.RepositoryImp;

import com.example.Sortilegios.Weasley.Domain.Dto.Witcher;
import com.example.Sortilegios.Weasley.Domain.Repository.WitcherRepository;
import com.example.Sortilegios.Weasley.Persistence.Crud.MagoCrud;
import com.example.Sortilegios.Weasley.Persistence.Entity.Mago;
import com.example.Sortilegios.Weasley.Persistence.Mapper.WitcherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class WitcherRepositoryImp implements WitcherRepository {

    private final MagoCrud magoCrud;
    private final WitcherMapper witcherMapper;
    @Autowired
    public WitcherRepositoryImp(MagoCrud magoCrud, WitcherMapper witcherMapper) {
        this.magoCrud = magoCrud;
        this.witcherMapper = witcherMapper;
    }
    @Override
    public List<Witcher> getAll() {
        List<Mago> magoList = magoCrud.findAll();
        return witcherMapper.toWitchers(magoList);
    }
}
