package com.example.renthaus.Repository;

import com.example.renthaus.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

    public interface ImageRepository extends JpaRepository<Image, Long> {
    }

