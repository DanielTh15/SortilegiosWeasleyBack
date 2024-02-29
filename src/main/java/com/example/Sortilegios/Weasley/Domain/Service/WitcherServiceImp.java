package com.example.Sortilegios.Weasley.Domain.Service;

import com.example.Sortilegios.Weasley.Domain.Dto.Purchase;
import com.example.Sortilegios.Weasley.Domain.Dto.Witcher;
import com.example.Sortilegios.Weasley.Domain.Repository.WitcherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WitcherServiceImp implements WitcherService{

 private final WitcherRepository witcherRepository;
    @Autowired
    public WitcherServiceImp(WitcherRepository witcherRepository) {
        this.witcherRepository = witcherRepository;
    }


    @Override
    public List<Witcher> getAll() {
        return witcherRepository.getAll();
    }
}
