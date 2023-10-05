package com.example.renthaus.services.impl;


import com.example.renthaus.Repository.NeighborhoodRepository;
import com.example.renthaus.entity.Neighborhood;
import com.example.renthaus.entity.Town;
import com.example.renthaus.services.NeighborhoodService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NeighborhoodServiceImpl implements NeighborhoodService {

    private final NeighborhoodRepository neighborhoodRepository;

    public NeighborhoodServiceImpl(NeighborhoodRepository neighborhoodRepository) {
        this.neighborhoodRepository = neighborhoodRepository;
    }


    @Override
    public List<Neighborhood> findAllByCity(Town town) {
        return  neighborhoodRepository.findAllByTown(town);
    }
}
