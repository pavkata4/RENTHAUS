package com.example.renthaus.Repository;


import com.example.renthaus.entity.Town;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TownRepository extends JpaRepository<Town, Long> {

    @Query("select t from Town t")
    Set<Town> getAll();


    Town findById(long id);
}
