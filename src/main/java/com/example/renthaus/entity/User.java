package com.example.renthaus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table
@Entity(name = "users")
public class User extends BaseClass{

    public User() {
    }
}
