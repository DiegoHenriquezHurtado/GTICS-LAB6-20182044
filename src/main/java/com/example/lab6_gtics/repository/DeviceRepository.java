package com.example.lab6_gtics.repository;

import com.example.lab6_gtics.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository <Device,Integer>{
}
