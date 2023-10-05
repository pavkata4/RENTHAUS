package com.example.renthaus.Repository;

import com.example.renthaus.entity.Neighborhood;
import com.example.renthaus.entity.Town;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface NeighborhoodRepository extends JpaRepository<Neighborhood, Long> {

    List<Neighborhood> findAllByTown(Town town);
}
