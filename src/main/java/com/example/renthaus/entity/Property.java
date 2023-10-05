package com.example.renthaus.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;



@Entity
@Table(name = "properties")
public  class Property  extends BaseClass{
    @ManyToOne
    private Address address;
    @Column(name = "square_footage", nullable = false)
    private int squareFootage;
    @Column(name = "price", nullable = false)
    private BigDecimal price;
    @Column(name = "heating", nullable = false)
    private boolean heating;  //toplofikaciq
    @Column(name = "gasification")
    private boolean gasification;
    @Column(name = "description", columnDefinition = "TEXT", nullable = false)
    private String description;
    @OneToMany
    private List<Image> images;

//    @Enumerated
//    private Set<Features> features;




    public Property(Address address, int squareFootage, BigDecimal price, boolean heating, boolean gasification, String description, Set<Features> features) {
        this.address = address;
        this.squareFootage = squareFootage;
        this.price = price;
        this.heating = heating;
        this.gasification = gasification;
        this.description = description;
//        this.features = features;

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isHeating() {
        return heating;
    }

    public void setHeating(boolean heating) {
        this.heating = heating;
    }

    public boolean isGasification() {
        return gasification;
    }

    public void setGasification(boolean gasification) {
        this.gasification = gasification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
    //    public Set<Features> getFeatures() {
//        return features;
//    }
//
//    public void setFeatures(Set<Features> features) {
//        this.features = features;
//    }

}
