package com.example.lab6_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "device")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeviceID" , nullable = false)
    private Integer idDevice;

    @Column(name = "DeviceName", length = 255)
    private String deviceName;

    @Column(name = "DeviceType", length = 255)
    private String deviceType;

    @Column(name = "Model", length = 255)
    private String modelo;

    @Column(name = "SerialNumber", length = 255)
    private String serialNumber;

    @ManyToOne
    @JoinColumn(name = "SiteID",nullable = false)
    private Site site;
}
