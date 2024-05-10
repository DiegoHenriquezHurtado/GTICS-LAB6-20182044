package com.example.lab6_gtics.repository;

import com.example.lab6_gtics.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Integer> {
}
