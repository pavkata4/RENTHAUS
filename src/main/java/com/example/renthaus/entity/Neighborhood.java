package com.example.renthaus.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "neighborhoods")
public class Neighborhood extends BaseClass{

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Town town;

    public Neighborhood() {
    }

    public Neighborhood(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    @Override
    public long getId() {
        return super.getId();
    }
}
