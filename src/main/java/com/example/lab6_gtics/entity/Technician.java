package com.example.lab6_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "technician")
public class Technician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TechnicianID" , nullable = false)
    private Integer idTechnician;

    @Column(name = "FirstNAme", length = 100,nullable = false)
    private String firtName;

    @Column(name = "LastName", length = 100,nullable = false)
    private String lastName;

    @Column(name = "Dni", length = 8,nullable = false)
    private String dni;

    @Column(name = "Phone", length = 9,nullable = false)
    private String phone;

    @Column(name = "Age")
    private Integer age;
}
