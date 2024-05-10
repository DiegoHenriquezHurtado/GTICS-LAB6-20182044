package com.example.lab6_gtics.repository;

import com.example.lab6_gtics.entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician,Integer> {
}
