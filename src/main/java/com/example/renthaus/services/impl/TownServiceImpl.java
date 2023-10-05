package com.example.renthaus.services.impl;

import com.example.renthaus.Repository.TownRepository;
import com.example.renthaus.entity.Town;
import com.example.renthaus.services.TownService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class TownServiceImpl implements TownService {

    private final TownRepository townRepository;

    public TownServiceImpl(TownRepository townRepository) {
        this.townRepository = townRepository;
    }

    @Override
    public Set<Town> getAll() {
        return townRepository.getAll();
    }

    @Override
    public Optional<Town> findById(Long cityId) {
      return  townRepository.findById(cityId);
    }
}
