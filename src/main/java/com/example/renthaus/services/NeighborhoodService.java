package com.example.renthaus.services;

import com.example.renthaus.entity.Neighborhood;
import com.example.renthaus.entity.Town;

import java.util.List;

public interface NeighborhoodService {

    List<Neighborhood> findAllByCity(Town town);
}
