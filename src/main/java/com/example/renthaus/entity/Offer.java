package com.example.renthaus.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "offers")

public class Offer extends BaseClass{

    @OneToOne
    private Property property;

    @ManyToOne
    private User owner;

   public Offer(Property property, User owner) {
       this.property = property;
      this.owner = owner;
 }

    public Offer() {

    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
