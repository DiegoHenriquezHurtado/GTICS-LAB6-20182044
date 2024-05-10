package com.example.lab6_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LocationID" , nullable = false)
    private Integer idLocation;

    @Column(name = "City", length = 255)
    private String city;

    @Column(name = "Country", length = 255)
    private String country;
}
