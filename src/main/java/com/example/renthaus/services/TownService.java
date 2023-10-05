package com.example.renthaus.services;

import com.example.renthaus.entity.Town;

import java.util.Optional;
import java.util.Set;

public interface TownService {
    public Set<Town> getAll();

    Optional<Town> findById(Long cityId);
}
