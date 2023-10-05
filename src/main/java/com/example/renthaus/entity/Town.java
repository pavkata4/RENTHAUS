package com.example.renthaus.entity;


import jakarta.persistence.*;

import java.util.Set;

@Table(name = "towns")
@Entity
public class Town extends BaseClass{

    @Column
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Neighborhood> neighborhoods;

    public Town() {
    }

    public Town(String name, Set<Neighborhood> neighborhoods) {
        this.name = name;
        this.neighborhoods = neighborhoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Neighborhood> getNeighborhoods() {
        return neighborhoods;
    }

    public void setNeighborhoods(Set<Neighborhood> neighborhoods) {
        this.neighborhoods = neighborhoods;
    }
}
