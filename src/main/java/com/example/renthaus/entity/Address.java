package com.example.renthaus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address extends BaseClass{
    @ManyToOne
    private Neighborhood neighborhood;
    @Column(name = "street")
    private String street;
    @Column(name = "number")
    private int number;
    @Column(name = "entrance")
    private String entrance;

    public Address() {
    }

    public Address(Neighborhood neighborhood, String street, int number, String entrance) {
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.entrance = entrance;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

}
